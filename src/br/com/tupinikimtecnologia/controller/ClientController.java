package br.com.tupinikimtecnologia.controller;

import java.util.List;

import br.com.tupinikimtecnologia.model.dao.ClientDao;
import br.com.tupinikimtecnologia.model.entity.Client;

public class ClientController {
	
	private ClientDao clientDao;
	
	public ClientController(){
		clientDao = new ClientDao();
	}
	
	public void insertClient(Client client){
		clientDao.insertClient(client);
	}
	
	public boolean removeClient(int id){
		return clientDao.removeClient(id);
	}
	
	public List<Client> getClientByName(String name){
		return clientDao.getClientByName(name);
	}
	
	public List<Client> getClientAll(){
		return clientDao.getClientAll();
	}
	
	/**
	 * Will check if client name length are > 100
	 * @param name Client name
	 * @return false if length>100, true if length<100
	 */
	public boolean checkClientName(String name){
		if(name.length()>100 || name.equals("")){
			return false;
		}
		return true;
	}
	
	
	public boolean checkClientCountry(String country){
		if(country.equals("")){
			return false;
		}
		return true;
	}
	
	
	public boolean checkClientAddress(String address){
		if(address.equals("")){
			return false;
		}
		return true;
	}

}
