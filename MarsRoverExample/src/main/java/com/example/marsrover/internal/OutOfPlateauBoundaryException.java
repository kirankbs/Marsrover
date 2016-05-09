package com.example.marsrover.internal;

public class OutOfPlateauBoundaryException extends RuntimeException {
	
	private final String message;
	
	public OutOfPlateauBoundaryException(String message) {
		super(message);
		this.message = message;
	}

}
