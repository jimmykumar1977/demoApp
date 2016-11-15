package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("status")
public interface StatusService {

	
	  @GET
	   String status() ;
	  
	  @GET
	  @Path("/test")
	  public String test();
}
