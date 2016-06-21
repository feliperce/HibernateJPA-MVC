package br.com.tupinikimtecnologia.view;

import java.util.List;

import br.com.tupinikimtecnologia.controller.ClientController;
import br.com.tupinikimtecnologia.model.entity.Client;
import br.com.tupinikimtecnologia.utils.ThUtils;

public class GetClientAllView extends GetClient implements ViewBase {
	
	public GetClientAllView(){
		clientController = new ClientController();
	}

	@Override
	public int printMenu() {
		clientList = clientController.getClientAll();
		System.out.println("______________________________________________");
		System.out.println("                SHOW ALL CLIENTS\n");
		System.out.println("All clients:");

		if(clientList!=null || clientList.isEmpty()){
			showClients(clientList);
		}else{
			System.out.println("There is no registered client.");
		}
		return clientList.size();
	}
	
	

}
