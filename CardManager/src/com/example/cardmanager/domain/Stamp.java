package com.example.cardmanager.domain;

import android.app.Application;

public class Stamp  extends Application{

	private String cardID;
	private String date; 			//DMY format
	private float payment;			//amount of money used

	
	/**
	 * Class Contructor
	 * @param cardID
	 * @param date
	 * @param payment
	 */
	public Stamp(String cardID, String date, float payment) {
		this.cardID = cardID;
		this.date = date;
		this.payment = payment;
	}
	/**
	 * @return the cardID
	 */
	public String getCardID() {
		return cardID;
	}
	/**
	 * @param cardID the cardID to set
	 */
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the payment
	 */
	public float getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(float payment) {
		this.payment = payment;
	}
	


}
