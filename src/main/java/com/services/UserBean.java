package com.services;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.model.Note;
import com.model.User;

@Stateless
@LocalBean
public class UserBean {

	@PersistenceUnit(unitName="demojpa")
	protected EntityManagerFactory entityManager;
	
	public User getUser(String id) {
		User t = (User) entityManager.createEntityManager().find(User.class, Long.parseLong(id));
		System.out.println("***************** "+t);
		return t;
	}
	
	public void createNote(String uid,Note note) {
		EntityManager em = entityManager.createEntityManager();
		em.getTransaction().begin();
		
		User u = getUser(uid);
		note.setUser(u);
		em.persist(note); 
		em.getTransaction().commit();
	}
	
	public void updateNote(String id,Note nt){
		EntityManager em = entityManager.createEntityManager();
		em.getTransaction().begin();
		Note n = getNote(id);
		n.setNote(nt.getNote());
		n.setTitle(nt.getTitle());
		n.setUpdated(new Date());
		em.merge(n); 
		em.getTransaction().commit();
	}
	
	public List<Note> getUserNote(String id) {
		User t = (User) entityManager.createEntityManager().find(User.class, Long.parseLong(id));
		Collection<Note> cl = t.getNotes();
		List<Note> lst = (List<Note>)cl;
		return lst;
	}
	
	public Note getNote(String id) {
		Note n = (Note) entityManager.createEntityManager().find(Note.class, Long.parseLong(id));
		return n ;
	}
	
	public void deleteNote(String id) {
		EntityManager em = entityManager.createEntityManager();
		em.getTransaction().begin();
		Note nn = em.find(Note.class, Long.parseLong(id));
		em.remove(nn);
		 em.getTransaction().commit();
		
	}
}
