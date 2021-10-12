package crudbase.exception;

import lombok.Getter;

public class MyCustomException extends RuntimeException {

	private static final long serialVersionUID = 1060537702528613628L;

	@Getter
	private String key;

	@Getter
	private String message;

	public MyCustomException(String key, String message) {
		this.key = key;
		this.message = message;
	}

	public MyCustomException(String key) {
		this.key = key;
	}
	
	public MyCustomException(Throwable e) {
		this.key = null;
		this.message = e.getLocalizedMessage();
	}

	public MyCustomException() {
		super();
	}
}
