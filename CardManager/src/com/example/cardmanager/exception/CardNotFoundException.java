package com.example.cardmanager.exception;

public class CardNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public CardNotFoundException() {
	}

	/**
	 * @param detailMessage
	 */
	public CardNotFoundException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	
}
