package com.example.cardmanager.domain;

public class Stamp{

	private int id;
	private String date; 			//DDMMYYYY format
	private float payment;			//amount of money used
	
	/**
	 * Class Contructor
	 * @param id
	 * @param date
	 * @param payment
	 */
	public Stamp(int id, String date, float payment) {
		this.id = id;
		this.date = date;
		this.payment = payment;
	}
	/**
	 * @return the cardID
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param cardID the cardID to set
	 */
	public void setId(int id) {
		this.id = id;
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
