package com.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import com.model.test;

@Stateless
@LocalBean
public class StatusServiceImpl implements StatusService {

	//@PersistenceContext(unitName="demojpa")
	@PersistenceUnit(unitName="demojpa")
	protected EntityManagerFactory entityManager;
	
	@Override
	public String status() {
		String output = "UP";
		return output;
	}

	@Override
	public String test() {
		System.out.println(entityManager);
		test t = (test) entityManager.createEntityManager().find(test.class, 1L);
		return t.getData();

	}
}
