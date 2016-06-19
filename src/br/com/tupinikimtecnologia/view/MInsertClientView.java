package br.com.tupinikimtecnologia.view;

import java.util.Scanner;

import br.com.tupinikimtecnologia.controller.ClientController;

public class MInsertClientView implements MenuBase {
	
	private Scanner scanner;
	private ClientController clientController;
	
	public MInsertClientView(){
		scanner = new Scanner(System.in);
		clientController = new ClientController();
	}

	@Override
	public int printMenu() {
		System.out.println("______________________________________________");
		System.out.println("                INSERT CLIENT\n");
		System.out.println("Enter the client name ");
		
		return 0;
	}

}
