package com.example.cardmanager.domain;

import android.app.Application;

public class Stamp  extends Application{

	private long cardID;
	private String date; 			//DDMMYYYY format
	private float payment;			//amount of money used

	
	/**
	 * Class Contructor
	 * @param id
	 * @param date
	 * @param payment
	 */
	public Stamp(long id, String date, float payment) {
		this.cardID = id;
		this.date = date;
		this.payment = payment;
	}
	/**
	 * @return the cardID
	 */
	public long getCardID() {
		return cardID;
	}
	/**
	 * @param cardID the cardID to set
	 */
	public void setCardID(long cardID) {
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
