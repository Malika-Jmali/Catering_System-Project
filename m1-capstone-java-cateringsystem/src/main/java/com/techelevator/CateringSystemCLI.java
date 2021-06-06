package com.techelevator;

import com.techelevator.view.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CateringSystemCLI {

	private UserInterface ui;
	private Inventory inventory;
	private CashRegister register;
	private Product productItem;
	private ShoppingCart cart;


	public CateringSystemCLI(UserInterface ui) {

		this.ui = ui;
		try {
			inventory = new Inventory();
			register = new CashRegister(0);
			productItem = new Product();
			cart = new ShoppingCart();

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

		ui.printWelcomeMessage();

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

						int money = ui.askToAddMoney();
						register.addMoney(money);

					}
					else if (choice.equals("2")) {
						List<Product> everything = inventory.retrieveAllItems(); //same as option 1 from main menu
						ui.printListOfItems(everything);

						String itemCode = ui.printItemCode();
						Product productByCode = inventory.retrieveItemByProductCode(itemCode); //getting product by productCode
						if(productByCode == null) { //if code does not exist, print doesNotExist
							ui.printItemDoesNotExist();

						} else {
							ui.printProductByCode(productByCode); //if found
							int itemQuantity = ui.askQuantity();

							if (productByCode.getQuantity() == 0) { //if the product is sold out (quantity = 0)
								ui.printSoldOutMessage();
							}
							else if (itemQuantity > productByCode.getQuantity()) { //if quantity requested to more than what is available
								ui.printInsufficientStockMessage();
							}
							else if (productByCode.getPrice() * itemQuantity > register.getBalance()) { //if the total price > current balance
								ui.printInsufficientBalance();
							}
							else { //if all goes well
								inventory.reduceInventory(itemCode, itemQuantity);
								register.reduceBalance(productByCode.getPrice(), itemQuantity); //same as minusMoney() from previous variable
								cart.addItem(itemCode, productByCode.getName(), productByCode.getPrice(), productByCode.getType(), itemQuantity);
								//instead of passing whole Product, we add each parameter one by one
							}
						}
					}
					else if (choice.equals("3")) {
						List<Product> customerCart = cart.getShoppingCartItem();
						ui.printReport(customerCart);
						ui.giveChange(register.getBalance());


						isSubMenuRunning = false;
						register.setBalance(0);
						cart.emptyCart();
					}
				}

			} else if (response.equals("3")) {
				isRunning = false;
				ui.quit();
			}

		}

	}
}
