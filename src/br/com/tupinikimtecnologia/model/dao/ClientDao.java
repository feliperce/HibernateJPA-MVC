package br.com.tupinikimtecnologia.model.dao;

import java.util.List;

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
		}finally{
			ent.close();
		}
	}
	
	public List<Client> getClientAll(){
		EntityManager ent = getEntityManager();
		ent.getTransaction().begin();
		List<Client> cList = ent.createQuery("from Client", Client.class).getResultList();
		ent.getTransaction().commit();
		ent.close();
		return cList;

	}
}
