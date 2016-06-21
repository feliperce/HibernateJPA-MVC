package br.com.tupinikimtecnologia.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	
	public boolean removeClient(int id){
		EntityManager ent = getEntityManager();
		boolean deleted = false;
		try{
			ent.getTransaction().begin();
			Client c = ent.find(Client.class, id);
			if(c!=null){
				ent.remove(c);
				deleted = true;
			}else{
				deleted = false;
			}
			ent.getTransaction().commit();
		}catch(Exception e){
			ent.getTransaction().rollback();
		}finally{
			ent.close();
		}
		return deleted;
	}
	
	public List<Client> getClientByName(String name){
		EntityManager ent = getEntityManager();
		Query query = ent.createQuery("from Client where name like :name", Client.class);
		query.setParameter("name", "%"+name+"%");
		List<Client> clientList = query.getResultList();
		ent.close();
		return clientList;
	}
	
	public Client getClientById(int id){
		EntityManager ent = getEntityManager();
		Client c = ent.find(Client.class, id);
		ent.close();
		return c;
	}
	
	public List<Client> getClientAll(){
		EntityManager ent = getEntityManager();
		List<Client> cList = ent.createQuery("from Client", Client.class).getResultList();
		ent.close();
		return cList;

	}
}
