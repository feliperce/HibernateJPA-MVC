package br.com.tupinikimtecnologia.view;

import br.com.tupinikimtecnologia.model.dao.ClientDao;
import br.com.tupinikimtecnologia.model.entity.Client;
import br.com.tupinikimtecnologia.utils.ThUtils;

public class MainView {

	public static void main(String[] args) {

		int op = -1;
		boolean canContinue = false;
		MMainView menuMain = new MMainView();
		
		while(!canContinue){
			switch(op){
				case -1:
					
					op = menuMain.printMenu();
					break;
				case 1:
					MInsertClientView mInsertClientView = new MInsertClientView();
					mInsertClientView.printMenu();
					op = menuMain.printMenu();
					break;
				case 2:
					//Edit
					break;
				case 3:
					MGetAllClientView mGetAllClientView = new MGetAllClientView();
					int qtRecords = mGetAllClientView.printMenu();
					System.out.println("Total records: "+qtRecords);
					ThUtils.systemSleep(5000);
					op = menuMain.printMenu();
					break;
				case 4:
					//search
					break;
				case 5:
					//remove
					break;
				case 0:
					canContinue = false;
					break;
				default:
					System.out.println("*** ERROR: Choose the correct option [0-5] ***");
					ThUtils.systemSleep(2000);
					op = menuMain.printMenu();
				
			}

		}
		
		/*Client client = new Client();
		ClientDao clientDao = new ClientDao();
		client.setAddress("Adresssss");
		client.setAge(55);
		client.setCountry("Brazil");
		client.setCpf(456465);
		client.setName("Nomeeeeeee");
		clientDao.insertClient(client);*/
		
	}

}
