package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.model.Note;
import com.model.User;

@Path("/rest")
public interface RestService {
	  
	  @GET
	  @Produces("application/json")
	  @Path("/user/{id}")
	  public User getUser(@PathParam("id") String id);
	  
	  @GET
	  @Produces("application/json")
	  @Path("/note/{id}")
	  public Note getNote(@PathParam("id") String id);
}
