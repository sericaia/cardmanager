package com.example.cardmanager.domain;

public abstract class Person {
	
	private long id; 			//auto-generated supplier ID
	private long NIF;
	private String name;
	
	/**
	 * @param id
	 * @param nIF
	 * @param name
	 */
	public Person(long id, long nIF, String name) {
		this.id = id;
		NIF = nIF;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nIF
	 */
	public long getNIF() {
		return NIF;
	}
	/**
	 * @param nIF the nIF to set
	 */
	public void setNIF(long nIF) {
		NIF = nIF;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}