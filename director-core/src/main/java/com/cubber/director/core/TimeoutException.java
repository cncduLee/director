package com.cubber.director.core;

public class TimeoutException extends DirectorException {

	private static final long serialVersionUID = -5423490721470482068L;

	public TimeoutException() {
		super();
	}

	public TimeoutException(String message, Throwable cause) {
		super(message, cause);
	}

	public TimeoutException(String message) {
		super(message);
	}

	public TimeoutException(Throwable cause) {
		super(cause);
	}

}
