package br.com.tupinikimtecnologia.model.dao;

import javax.persistence.EntityManager;

import br.com.tupinikimtecnologia.model.entity.Client;

public class ClientDao extends Dao {
	
	public void insertClient(Client client){
		EntityManager ent = getEntityManager();
		try{
			ent.getTransaction().begin();
			ent.persist(client);
			ent.getTransaction().commit();
		}catch(Exception e){
			ent.getTransaction().rollback();
		}
	}
}
