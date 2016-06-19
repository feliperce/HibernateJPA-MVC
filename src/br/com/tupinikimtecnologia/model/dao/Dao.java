package br.com.tupinikimtecnologia.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	
	private EntityManagerFactory ent;
	
	public EntityManager getEntityManager(){
		return ent.createEntityManager();
	}
	
	public Dao(){
		ent = Persistence.createEntityManagerFactory("clientbase");
	}

}
