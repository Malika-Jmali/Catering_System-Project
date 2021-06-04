package com.techelevator;

import com.techelevator.view.CashRegister;
import com.techelevator.view.Inventory;
import com.techelevator.view.ReaderFile;
import com.techelevator.view.UserInterface;

import java.io.FileNotFoundException;
import java.util.List;

public class CateringSystemCLI {

	private UserInterface ui;
	private Inventory inventory;
	private CashRegister register;

//	private final String DISPLAY_ALL_CATERING_ITEMS = "1";
//	private final String ORDER = "2";

	public CateringSystemCLI(UserInterface ui) {

		this.ui = ui;
		try {
			inventory = new Inventory();
			register = new CashRegister(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UserInterface menu = new UserInterface();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}

	public void run() {

		boolean isRunning = true;
		while(isRunning) {
			String response = ui.printMainMenu();
			if (response.equals("1")) {
				List<Product> everything = inventory.retrieveAllItems();
				ui.printListOfItems(everything);
			} else if (response.equals("2")) {
				boolean isSubMenuRunning = true;
				while(isSubMenuRunning) {
					String choice = ui.printSubMenu(register.getBalance());

					if (choice.equals("1")) {

						Double money = ui.askToAddMoney();
						register.addMoney(money); //what comes after is a mystery

					}
					else if (choice.equals("2")) {
						List<Product> everything = inventory.retrieveAllItems(); //same as option 1 from main menu
						ui.printListOfItems(everything);
						String itemCode = ui.printItemCode(); //Customer returns the selected item by itemCode
						List<Product> product = inventory.retrieveItemByProductCode(itemCode);
						ui.printListOfItems(product);

						int itemQuantity = ui.askQuantity();

						if (itemQuantity > product.size()) { //Still not sure if product.size() is coded correctly
							ui.printSoldOutMessage();
						}
						if (itemQuantity <= product.size() && product != null) { 

						}


					}
					else if (choice.equals("3")) {
						System.out.println("Complete Transaction");//for test - need to connect to UI later
						isSubMenuRunning = false;
					}
				}




			} else if (response.equals("3")) {
				isRunning = false;
				ui.quit();
			}

		}

	}
}





