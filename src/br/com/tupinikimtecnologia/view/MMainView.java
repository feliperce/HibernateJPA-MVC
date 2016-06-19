package br.com.tupinikimtecnologia.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.tupinikimtecnologia.utils.ThUtils;

public class MMainView implements MenuBase {
	
	private Scanner scanner;
	
	public MMainView(){
		scanner = new Scanner(System.in);
	}
	
	public int printMenu(){
		int op = -1;
		System.out.println("********************************************");
		System.out.println("*                MAIN MENU                 *");
		System.out.println("*                                          *");
		System.out.println("********************************************\n");
		
		System.out.println("1- Insert new client");
		System.out.println("2- Insert new client phone");
		System.out.println("3- Edit client");
		System.out.println("4- Show all Client");
		System.out.println("5- Client search");
		System.out.println("6- Remove client");
		System.out.println("0- Exit");
		try{
			op = scanner.nextInt();
		}catch(InputMismatchException e){
			System.out.println("*** ERROR: Please, enter only number format! ***");
			op = -1;
			ThUtils.systemSleep();
		}
		return op;
	}

}
