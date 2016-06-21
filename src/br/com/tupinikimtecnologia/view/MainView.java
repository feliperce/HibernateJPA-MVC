package br.com.tupinikimtecnologia.view;

import br.com.tupinikimtecnologia.model.dao.ClientDao;
import br.com.tupinikimtecnologia.model.entity.Client;
import br.com.tupinikimtecnologia.utils.ThUtils;

public class MainView {

	public static void main(String[] args) {

		int op = -1;
		boolean canContinue = false;
		MenuView menuMain = new MenuView();
		
		while(!canContinue){
			switch(op){
				case -1:
					op = menuMain.printMenu();
					break;
				case 1:
					//Insert Client
					InsertClientView insertClientView = new InsertClientView();
					insertClientView.printMenu();
					ThUtils.systemSleep(2000);
					op = -1;
					break;
				case 2:
					//Edit Client
					op = -1;
					break;
				case 3:
					//Show all Clients
					GetClientAllView getAllClientView = new GetClientAllView();
					int qtClientsAll = getAllClientView.printMenu();
					System.out.println("Total records: "+qtClientsAll);
					ThUtils.systemSleep(7000);
					op = -1;
					break;
				case 4:
					//Search Client
					GetClientView getClientView = new GetClientView();
					int qtClientsSearch = getClientView.printMenu();
					System.out.println("Total records: "+qtClientsSearch);
					ThUtils.systemSleep(7000);
					op = -1;
					break;
				case 5:
					//Remove Client
					RemoveClientView removeClientView = new RemoveClientView();
					removeClientView.printMenu();
					ThUtils.systemSleep(3000);
					op = -1;
					break;
				case 0:
					//Exit system
					System.exit(0);
					break;
				default:
					System.out.println("*** ERROR: Choose the correct option [0-5] ***");
					ThUtils.systemSleep(2000);
					op = -1;
				
			}

		}
		
		
	}

}
