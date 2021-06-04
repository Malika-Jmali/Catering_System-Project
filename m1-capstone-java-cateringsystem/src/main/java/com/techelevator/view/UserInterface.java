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

        System.out.println(" Please select your choice");
        String response= scanner.nextLine();
        return response;

    }


    public String printSubMenu(){
        System.out.println("(1) Add Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Transaction");

        String choice= scanner.nextLine();
        return choice;
        //toString method to get current account balance
    }



    public void printListOfItems(List<Product> productList) { //format this later
        for (Product product : productList) {
            System.out.println(product.getCode() + " " + product.getName() + " " + product.getType() + " $" + product.getPrice());
        }
    }

    public void quit() {
        System.out.println("Thank you for visiting!!");
    }

}
