package br.com.tupinikimtecnologia.view;

import java.util.Scanner;

import br.com.tupinikimtecnologia.controller.ClientController;
import br.com.tupinikimtecnologia.model.entity.Client;
import br.com.tupinikimtecnologia.utils.ThUtils;

public class MInsertClientView implements MenuBase {
	
	private Scanner scanner;
	private ClientController clientController;
	
	public MInsertClientView(){
		scanner = new Scanner(System.in);
		clientController = new ClientController();
	}

	@Override
	public int printMenu() {
		boolean canContinue = false;
		Client client = new Client();
		System.out.println("______________________________________________");
		System.out.println("                INSERT CLIENT\n");
		do{
			do{
				System.out.println("Enter the client name ");
				String name = scanner.nextLine();
				scanner.nextLine();
				if(!clientController.checkClientName(name)){
					System.out.println("*** ERROR: Please, enter a name less than 100 characters ***");
					canContinue = false;
				}else{
					client.setName(name);
					canContinue = true;
				}
			}while(!canContinue);
			
			/*do{
				System.out.println("Enter the client age");
				int age = scanner.nextInt();
				if(!clientController.checkClientName(name)){
					System.out.println("*** ERROR: Please, enter a name less than 100 characters ***");
					canContinue = false;
				}else{
					client.setName(name);
					canContinue = true;
				}
			}while(!canContinue);*/
			
		}while(!canContinue);
		System.out.println("SUCESS!! Client registered");
		ThUtils.systemSleep();
		return 0;
	}

}
