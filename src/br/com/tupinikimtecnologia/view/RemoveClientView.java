package br.com.tupinikimtecnologia.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.tupinikimtecnologia.controller.ClientController;
import br.com.tupinikimtecnologia.model.entity.Client;

public class RemoveClientView implements ViewBase {
	
	private Scanner scanner;
	private ClientController clientController;
	
	public RemoveClientView(){
		clientController = new ClientController();
	}
	
	@Override
	public int printMenu() {
		boolean canContinue = false;
		Client client = new Client();
		System.out.println("______________________________________________");
		System.out.println("                REMOVE CLIENT\n");
		do{
			scanner = new Scanner(System.in);
			System.out.println("Enter the client ID to remove or -1 to cancel");
			try{
				int id = scanner.nextInt();
				if(id!=-1){
					if(clientController.removeClient(id)){
						System.out.println("**** SUCESS: REMOVED!! ****");
						canContinue = true;
					}else{
						System.out.println("** ERROR: There's no client with this ID **");
						canContinue = false;
					}
				}else{
					canContinue = true;
				}
			}catch(InputMismatchException e){
				System.out.println("*** ERROR: Please, enter a number ***");
				canContinue = false;
			}
		}while(!canContinue);
		return 0;
	}

}
