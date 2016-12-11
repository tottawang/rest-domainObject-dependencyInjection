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
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      new Account();
    }
    long end = System.currentTimeMillis();
    return "Time taken to build 10k Account object " + (end - start) + " milliseconds";
  }
}
