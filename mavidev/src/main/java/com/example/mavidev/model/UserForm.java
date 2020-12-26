package com.example.mavidev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name="name", nullable=false, length=100)
	private String name;
	@Column(name="mail", nullable=false, length=100)
	private String mail;
	@Column(name="message", nullable=false, length=100)
	private String message;
	
	public UserForm(String name, String mail, String message) {
		super();
		this.name = name;
		this.mail = mail;
		this.message = message;
	}
	
	
	
	public UserForm(int id, String name, String mail, String message) {
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.message = message;
	}


	public int getId() {
		return id;
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
