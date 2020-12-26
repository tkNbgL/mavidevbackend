package com.example.mavidev.dao.model;

public class UserFormDao {
	private int id;
	private String name;
	private String mail;
	private String message;
	
	public UserFormDao() {	}
	
	public UserFormDao(String name, String mail, String message) {
		super();
		this.name = name;
		this.mail = mail;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getMessage() {
		return message;
	}
	
	
}
