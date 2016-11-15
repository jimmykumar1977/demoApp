package com.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.model.Note;

@Path("/rest")
public interface RestService {
	  
	  @GET
	  @Produces("application/json")
	  @Path("/user/{id}")
	  public Response getUser(@PathParam("id") String id);
	  
	  @GET
	  @Produces("application/json")
	  @Path("/user/{id}/note")
	  public Response getUserNotes(@PathParam("id") String id);
	  
	  @GET
	  @Produces("application/json")
	  @Path("/note/{id}")
	  public Response getNote(@PathParam("id") String id);
	  
	  @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Path("/user/{uid}/note")
	  public Response createNote(@PathParam("uid")  String uid,Note note);
	  
	  @PUT
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Path("/note/{id}")
	  public Response updateNote(@PathParam("id")  String uid,Note note);
	  
	  @DELETE
	  @Produces(MediaType.TEXT_PLAIN)
	  @Path("/note/{id}")
	  public Response deleteNote(@PathParam("id")  String uid);
}
