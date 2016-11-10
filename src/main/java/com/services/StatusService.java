package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("status")
public class StatusService {

	  @GET
	  public String status() {
	    String output = "UP";
	    return output;
	  }
}
