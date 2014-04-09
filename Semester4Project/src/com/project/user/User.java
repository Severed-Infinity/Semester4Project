package com.project.user;

public abstract class User {
  protected String name;
  protected String login; // what was I thinking?

  public User(String name, String login) {
    this.name = name;
    this.login = login;
  }

  public User getUser() {
    return this;
  }
}
