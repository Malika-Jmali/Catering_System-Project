package com.techelevator.view;

import com.techelevator.Product;

import java.util.List;
import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }
    public String printMainMenu(){

        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit");

        System.out.println(" Please select your choice: ");
        String response= scanner.nextLine();
        return response;

    }

    public String printSubMenu(double balance){
        System.out.println("(1) Add Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Transaction");

        System.out.println("Your current balance is " + balance);

        String choice= scanner.nextLine();
        return choice;
    }


    public String printItemCode(){
        System.out.println("Please select the item code ex:(A1): ");

        String itemCode = scanner.nextLine();
        return itemCode;
    }

    public int askQuantity(){
        System.out.println("How many of this item would you like? ");
        String quantity = scanner.nextLine();
        int quantityAsInteger = Integer.parseInt(quantity);
        return quantityAsInteger;
    }


    public int askToAddMoney() {
        System.out.println("How much money would you like to add in whole dollars? ");
        int moneyToAdd = scanner.nextInt();
        scanner.nextLine();
        return moneyToAdd;
    }














    public void printListOfItems(List<Product> productList) { //format this later
        for (Product product : productList) {
            System.out.println(product.getCode() + " " + product.getName() + " " + product.getType() + " $" + product.getPrice() + "  " + product.getQuantity());
        }
        System.out.println("\n");
    }

    public void quit() {
        System.out.println("Thank you for visiting!!");
    }

    public void printSoldOutMessage() {
        System.out.println("The item you have selected is sold out.");
    }

    public void printItemDoesNotExist() {
        System.out.println("The product code you have selected does not exist. \n");
    }

}
