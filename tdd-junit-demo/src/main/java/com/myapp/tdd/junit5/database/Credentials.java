package com.myapp.tdd.junit5.database;

public class Credentials {
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Credentials() {
		// TODO Auto-generated constructor stub
	}

}