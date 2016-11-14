package com.data.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emFactory;
	
	public static EntityManager getEM() {
		 emFactory = Persistence.createEntityManagerFactory("demojpa");
		 return emFactory.createEntityManager();
	}
}
