package br.com.tupinikimtecnologia.controller;

import br.com.tupinikimtecnologia.model.dao.ClientDao;
import br.com.tupinikimtecnologia.model.entity.Client;

public class ClientController {
	
	private ClientDao clientDao;
	
	public void insertClient(Client client){
		clientDao.insertClient(client);
	}
	
	/**
	 * Will check if client name length are > 100
	 * @param name Client name
	 * @return false if length>100, true if length<100
	 */
	public boolean checkClientName(String name){
		if(name.length()>100){
			return false;
		}
		return true;
	}

}
