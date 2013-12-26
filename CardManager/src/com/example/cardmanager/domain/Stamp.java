package com.example.cardmanager.domain;

import java.util.Date;

public class Stamp{

	//database ID calculation: CONCAT(cardID+date)
	private Date date; 				//DDMMYYYY format
	private float payment;			//amount of money used
	
	/**
	 * Class Contructor
	 * @param id
	 * @param date
	 * @param payment
	 */
	public Stamp(Date date, float payment) {
		this.date = date;
		this.payment = payment;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
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
