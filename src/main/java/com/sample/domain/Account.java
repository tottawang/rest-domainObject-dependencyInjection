package com.sample.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.sample.service.AccountService;

@Configurable
public class Account {

  private String username;

  @Autowired
  private AccountService service;

  public String getUsername() {
    return username;
  }

  public void setUsername(String data) {
    this.username = data;
  }

  public String doSomething() {
    if (service == null)
      return null;
    else
      return service.doSomething();
  }

}
