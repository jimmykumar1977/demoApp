package com.services;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.data.util.JpaUtil;
import com.model.test;

@Path("status")
public class StatusService {

	  @GET
	  public String status() {
	    String output = "UP";
	    return output;
	  }
	  
	  @GET
	  @Path("/test")
	  public String test() {
	    EntityManager em = JpaUtil.getEM();
	    test t = (test)em.find(test.class, 1L);
	    return t.getData();
	    
	  }
}
