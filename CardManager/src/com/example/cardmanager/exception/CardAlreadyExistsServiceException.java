package com.example.cardmanager.exception;

public class CardAlreadyExistsServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public CardAlreadyExistsServiceException() {
	}

	/**
	 * @param detailMessage
	 */
	public CardAlreadyExistsServiceException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	

}
