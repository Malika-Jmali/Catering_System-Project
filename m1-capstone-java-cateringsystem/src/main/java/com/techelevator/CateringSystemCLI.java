package com.techelevator;

import com.techelevator.view.Inventory;
import com.techelevator.view.ReaderFile;
import com.techelevator.view.UserInterface;

import java.io.FileNotFoundException;
import java.util.List;

public class CateringSystemCLI {

	private UserInterface ui;
	private Inventory inventory;

	public CateringSystemCLI(UserInterface ui) {

		this.ui = ui;
		try {
			inventory = new Inventory();
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

		String response = ui.printMainMenu();

		if (response.equals("1")) {
			List<Product> everything = inventory.retrieveAllItems();
			ui.printListOfItems(everything);
		} else if (response.equals("2")) {
			String choice = ui.printSubMenu();
			if (choice.equals("1")) {
				System.out.println("add money"); //for test - need to connect to UI later
			} else if (choice.equals("2")) {
				System.out.println("select product");//for test - need to connect to UI later
			} else if (choice.equals("3")) {
				System.out.println("Complete Transaction");//for test - need to connect to UI later
			}

		} else if(response.equals("3")) {
			ui.quit();
		}

		}


	}


