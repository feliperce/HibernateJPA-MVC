package br.com.tupinikimtecnologia.view;

import br.com.tupinikimtecnologia.model.dao.ClientDao;
import br.com.tupinikimtecnologia.model.entity.Client;

public class MainView {

	public static void main(String[] args) {

		int op = -1;
		boolean canContinue = false;
		
		while(!canContinue){
			switch(op){
				case -1:
					do{
						MMainView menuMain = new MMainView();
						op = menuMain.printMenu();
					}while(op!=0);
					break;
				case 1:
					do{
						MInsertClientView mInsertClientView = new MInsertClientView();
						mInsertClientView.printMenu();
					}while()
				
			}
			op = -1;
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
