package com.service.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

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
	public User getUser(String id) {
		User user = userBean.getUser(id);
		return user;
	}

	@Override
	public Note getNote(String id) {
		Note n = userBean.getNote(id);
		return n;
	}

	@Override
	public List<Note> getUserNotes(String id) {
		return userBean.getUserNote(id);
	}

}
