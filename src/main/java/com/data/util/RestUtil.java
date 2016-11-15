package com.data.util;

import javax.ws.rs.core.Response;

import com.model.ErrorModel;

public class RestUtil {

	public static Response create404Response(Class cls, Object id) {
		String errMsg = "Object of type :" + cls + " and key :" + id + " not found.";
		ErrorModel err = new ErrorModel("404", errMsg);
		return Response.status(404).entity(err).build();
	}

	public static Response create404Response(String msg, Object id) {
		String errMsg = msg + "not found for  key :" + id;
		ErrorModel err = new ErrorModel("404", errMsg);
		return Response.status(404).entity(err).build();
	}
}
