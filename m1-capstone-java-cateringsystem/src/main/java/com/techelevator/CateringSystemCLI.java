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
//
//		String response = ui.printMainMenu();
//
//		if(response.equals("1")) {
//
////			try {
////				myProductList = reader.loadData();
////			}
////			catch (FileNotFoundException e) {
////				e.printStackTrace();
////			}
//
//		} else if (response.equals("2")) {
//			//jump to Submenu
//
//
//		} else if(response.equals("3")) {
//			//Quit
//
//		}
//
	}
	
	



}
