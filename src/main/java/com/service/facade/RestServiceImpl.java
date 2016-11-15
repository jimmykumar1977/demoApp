package com.service.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import com.model.Note;
import com.model.User;
import com.rest.service.RestService;
import com.services.UserBean;

@Stateless
@LocalBean
public class RestServiceImpl implements RestService {

	@EJB
	UserBean userBean;

	@PersistenceUnit(unitName = "demojpa")
	protected EntityManagerFactory entityManager;

	@Override
	public Response getUser(String id) {
		User user = userBean.getUser(id);
		return Response.ok(user).build();
	}

	@Override
	public Response getNote(String id) {
		Note n = userBean.getNote(id);
		return Response.ok(n).build();
	}

	@Override
	public Response getUserNotes(String id) {
		List<Note> ln = userBean.getUserNote(id); 
		GenericEntity<List<Note>> lst = new GenericEntity<List<Note>>(ln) 
		{        };
		return Response.ok(lst).build();
	}

	@Override
	public Response createNote(String uid,Note note) {
		userBean.createNote(uid,note);
		return Response.status(201).build();
	}

	@Override
	public Response updateNote(String id,Note note) {
		userBean.updateNote(id,note);
		return Response.status(202).build();
	}
	
	@Override
	public Response deleteNote(String id) {
		userBean.deleteNote(id);
		return Response.ok().build();
	}

}
