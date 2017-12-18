/**
 * Copyright (c) 2014-2017, www.cubbery. All rights reserved.
 */
package com.cubber.director.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <b>创建人</b>：   <a href="mailto:cubber.zh@gmail.com">百墨</a> <br>
 * <b>修改人</b>：   <br>
 * <b>创建时间</b>： 17/12/18 - 上午10:55  <br>
 *
 * @version 1.0.0   <br>
 */
public class DirectorTest {
    static EventHandler<String> handler1 = new EventHandler<String>() {
        public void onEvent(String s) {
            System.out.println(s + "handler-1");
        }
    };
    static EventHandler<String> handler2 = new EventHandler<String>() {
        public void onEvent(String s) {
            System.out.println(s + "handler-2");
        }
    };
    static EventHandler<String> handler3 = new EventHandler<String>() {
        public void onEvent(String s) {
            System.out.println(s + "handler-3");
        }
    };
    static EventHandler<String> handler4 = new EventHandler<String>() {
        public void onEvent(String s) {
            System.out.println(s + "handler-4");
        }
    };
    static EventHandler<String> handler5 = new EventHandler<String>() {
        public void onEvent(String s) {
            System.out.println(s + "handler-5");
        }
    };


    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Director<String> director = new Director<String>(es);
        director.begin(handler1, handler2).then(handler3);
        director.ready();
        director.publish("test - ");

        Director<String> director1 = new Director<String>(es);
        director1.begin(handler1).then(handler3,handler2).then(handler4);
        director1.ready();
        director1.publish("test1 - ");

        Director<String> director2 = new Director<String>(es);
        director2.begin(handler1).then(handler2);
        director2.begin(handler1).then(handler3);
        director2.after(handler1).then(handler4);
        director2.ready();
        director2.publish("test2 - ");

        Director<String> director3 = new Director<String>(es);
        director3.begin(handler1, handler2);
        director3.after(handler1,handler2).then(handler4,handler3);
        director3.ready();
        director3.publish("test3 - ");

        Director<String> director4 = new Director<String>(es);
        director4.begin(handler1, handler2).then(handler3);
        director4.after(handler3).then(handler4, handler5);
        director4.ready();
        director4.publish("test4 - ");
    }
}
