package com.cubber.director.core;

/**
 * Director Exception which will be throwed by event handlers if any error
 * happened when handling event.
 * 
 * @author chenfeng
 * 
 */
public class DirectorException extends RuntimeException {

	private static final long serialVersionUID = 4898686611676070892L;

	public DirectorException() {
		super();
	}

	public DirectorException(String message, Throwable cause) {
		super(message, cause);
	}

	public DirectorException(String message) {
		super(message);
	}

	public DirectorException(Throwable cause) {
		super(cause);
	}

}
