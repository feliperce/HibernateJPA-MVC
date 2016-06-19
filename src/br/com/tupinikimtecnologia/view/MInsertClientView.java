package br.com.tupinikimtecnologia.view;

import java.util.InputMismatchException;
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
			//Insert Name
			do{
				System.out.println("Enter the client name ");
				String name = scanner.nextLine();

				if(!clientController.checkClientName(name)){
					System.out.println("*** ERROR: Please, enter a name less than 100 characters ***");
					canContinue = false;
				}else{
					client.setName(name);
					canContinue = true;
				}
			}while(!canContinue);
			
			//Insert Age
			do{
				System.out.println("Enter the client age");
				try{
					scanner = new Scanner(System.in);
					int age = scanner.nextInt();
					client.setAge(age);
					canContinue = true;
				}catch(InputMismatchException e){
					System.out.println("*** ERROR: Please, enter a number ***");
					canContinue = false;
				}
			}while(!canContinue);
			
			//Insert RG
			do{
				System.out.println("Enter the client RG (number only)");
				try{
					scanner = new Scanner(System.in);
					int rg = scanner.nextInt();
					client.setRg(rg);
					canContinue = true;
				}catch(InputMismatchException e){
					System.out.println("*** ERROR: Please, enter a number ***");
					canContinue = false;
				}
			}while(!canContinue);
			
			//Insert Country
			do{
				System.out.println("Enter the client country");
				String country = scanner.nextLine();
				if(!clientController.checkClientCountry(country)){
					System.out.println("*** ERROR: Please, enter the country ***");
					canContinue = false;
				}else{
					client.setCountry(country);
					canContinue = true;
				}
			}while(!canContinue);
			
			//Insert Address
			do{
				System.out.println("Enter the client address");
				String address = scanner.nextLine();
				if(!clientController.checkClientCountry(address)){
					System.out.println("*** ERROR: Please, enter the address ***");
					canContinue = false;
				}else{
					client.setCountry(address);
					canContinue = true;
				}
			}while(!canContinue);
			
		}while(!canContinue);
		System.out.println("SUCESS!! Client registered");
		clientController.insertClient(client);
		ThUtils.systemSleep();
		return 0;
	}

}
