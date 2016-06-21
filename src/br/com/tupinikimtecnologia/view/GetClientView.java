package br.com.tupinikimtecnologia.view;

import java.util.List;
import java.util.Scanner;

import br.com.tupinikimtecnologia.controller.ClientController;
import br.com.tupinikimtecnologia.model.entity.Client;

public class GetClientView extends GetClient implements ViewBase {

	private Scanner scanner;
	
	public GetClientView(){
		scanner = new Scanner(System.in);
		clientController = new ClientController();
	}
	
	@Override
	public int printMenu() {
		clientController = new ClientController();
		System.out.println("______________________________________________");
		System.out.println("                SEARCH CLIENTS\n");
		
		System.out.println("Enter the client name");
		String name = scanner.nextLine();
		clientList = clientController.getClientByName(name);
		if(clientList!=null || clientList.isEmpty()){
			showClients(clientList);
		}else{
			System.out.println("There is no client with this name.");
		}
		return clientList.size();
	}

}
