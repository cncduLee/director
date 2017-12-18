package com.cubber.director.core;

/**
 * Callback interface to be implemented for processing event.
 * 
 * @author chenfeng
 * 
 * @param <Event>
 *            event published by sirector
 */
public interface EventHandler<Event> {

	/**
	 * Called when event is published by {@link Director#publish(Object)}
	 * synchronously or {@link Director#publish(Object, Callback)}
	 * asynchronously.
	 * 
	 * @param event
	 *            event to be handled
	 */
	public void onEvent(Event event);

}
