package br.com.tupinikimtecnologia.view;

import java.util.List;

import br.com.tupinikimtecnologia.controller.ClientController;
import br.com.tupinikimtecnologia.model.entity.Client;
import br.com.tupinikimtecnologia.utils.ThUtils;

public class MGetAllClientView implements MenuBase {

	@Override
	public int printMenu() {
		Client client = new Client();
		ClientController clientController = new ClientController();
		List<Client> clientList = clientController.getClientAll();
		System.out.println("______________________________________________");
		System.out.println("                SHOW ALL CLIENTS\n");
		System.out.println("All clients:");

		if(clientList!=null || clientList.isEmpty()){
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
		}else{
			System.out.println("There is no registered client.");
		}
		return clientList.size();
	}

}
