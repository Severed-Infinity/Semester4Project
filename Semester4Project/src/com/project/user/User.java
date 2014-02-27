package com.project.user;

public abstract class User {

	protected String name;
	protected String login;
	
	public User(String name, String login) {
		this.name = name;
		this.login = login;
	}

}
