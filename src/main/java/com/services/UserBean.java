package com.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.model.User;

@Stateless
@LocalBean
public class UserBean {

	@PersistenceUnit(unitName="demojpa")
	protected EntityManagerFactory entityManager;
	
	public User getUser(String id) {
		User t = (User) entityManager.createEntityManager().find(User.class, 1L);
		return t;
	}
}
