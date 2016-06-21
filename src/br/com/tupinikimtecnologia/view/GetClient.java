package br.com.tupinikimtecnologia.view;

import java.util.List;

import br.com.tupinikimtecnologia.controller.ClientController;
import br.com.tupinikimtecnologia.model.entity.Client;

public abstract class GetClient {
	
	protected ClientController clientController;
	protected List<Client> clientList;
	
	protected void showClients(List<Client> clientList){
		for(Client c : clientList){
			System.out.format("|ID: %-5s |Name: %-20s |Age: %-5s |RG: %-8s |Country: %-15s |Address: %-30s%n", 
					c.getId(), 
					c.getName(),
					c.getAge(),
					c.getRg(),
					c.getCountry(),
					c.getAddress()
			);
		}
	}
}
