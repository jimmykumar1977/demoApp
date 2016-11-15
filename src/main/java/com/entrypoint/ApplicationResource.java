package com.entrypoint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.service.facade.RestServiceImpl;

public class ApplicationResource extends Application
{

	 public Set<Class<?>> getClasses() {
	        return new HashSet<Class<?>>(Arrays.asList(RestServiceImpl.class));
	    }
}
