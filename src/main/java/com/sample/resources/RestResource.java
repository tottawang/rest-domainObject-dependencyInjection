package com.sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.sample.domain.Account;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class RestResource {

  @GET
  @Path("domain-obj-di")
  public String getDomainObjDI() {
    Account account = new Account();
    return account.doSomething();
  }
}
