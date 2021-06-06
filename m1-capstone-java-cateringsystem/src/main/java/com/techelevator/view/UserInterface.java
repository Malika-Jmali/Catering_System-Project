package com.techelevator.view;

import com.techelevator.Product;

import java.util.List;
import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }

    public void printWelcomeMessage() {

        System.out.println("");
        System.out.println("Welcome to Malika and Solomon's Super Cool Vending Catering Machine!! \n");
    }


    public String printMainMenu(){

        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit \n");

        System.out.println("Please select your choice: ");
        String response1= scanner.nextLine();
        String response = response1.trim();
        return response;

    }

    public String printSubMenu(double balance){

        System.out.println("(1) Add Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Transaction");

        System.out.print("Your current balance is ");
        System.out.printf("$%.2f", balance);
        System.out.println("\n");
        System.out.println("Please select your choice: ");

        String choice1= scanner.nextLine();
        String choice = choice1.trim();
        return choice;
    }

    public String printItemCode(){
        System.out.println("Please select the item code ex:(A1): \n");
        String itemCode1 = scanner.nextLine();
        String itemCode = itemCode1.trim();
        return itemCode;
    }

    public int askQuantity(){
        System.out.println("How many of this item would you like? \n");
        String quantity1 = scanner.nextLine();
        String quantity = quantity1.trim();
        int quantityAsInteger = Integer.parseInt(quantity);
        return quantityAsInteger;
    }

    public int askToAddMoney() {
        System.out.println("How much money would you like to add in whole dollars? \n");
        int moneyToAdd = scanner.nextInt();
        scanner.nextLine();
        return moneyToAdd;
    }

    public void printListOfItems(List<Product> productList) {
        System.out.printf("Code\tProduct Name\t\tType\tPrice\tQuantity %n");
        System.out.printf("----------------------------------------------------%n");
        for (Product product : productList) {
            System.out.printf("%-5s %-22s %-6s %-9.2f %-3d %n", product.getCode(),product.getName(),product.getType(),product.getPrice(),product.getQuantity());
        }
        System.out.println("\n");
    }

    public void printProductByCode(Product singleProduct) {
        System.out.printf("Code\tProduct Name\t\tType\tPrice\tQuantity %n");
        System.out.printf("----------------------------------------------------%n");
        if(singleProduct != null) {
            System.out.printf("%-5s %-22s %-6s %-9.2f %-3d %n", singleProduct.getCode(), singleProduct.getName(), singleProduct.getType(),singleProduct.getPrice(), singleProduct.getQuantity());
            System.out.println("\n");
        }
    }

    public void printReport(List<Product> allShoppingList) {
        System.out.println("");
        System.out.printf("Quantity\tProduct Type\t\tProduct Name\t\tPrice/Item\t\tTotal Price %n");
        System.out.printf("--------------------------------------------------------------------------------%n");
        double sum = 0;
        for (Product product: allShoppingList) {
            Double priceXQuantity = Double.valueOf(product.getQuantity()) * product.getPrice();
            System.out.printf("%-11d %-16s %-26s $%-12.2f $%-3.2f %n", product.getQuantity(),product.getNameOfType(),product.getName(),product.getPrice(), priceXQuantity);
            sum += priceXQuantity;
            System.out.println("");
        }
        System.out.print("Total Cost: ");
        System.out.printf("$%.2f", sum);
        System.out.println("\n");

    }

    public void giveChange(double balance) {
        Double r = balance * 100;

        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;

        while (r > 1) {
            if (r >= 2000) {
                r -= 2000;
                twenty++;
            } else if (r >= 1000) {
                r -= 1000;
                ten++;
            } else if (r >= 500) {
                r -= 500;
                five++;
            } else if (r >= 100) {
                r -= 100;
                one++;
            } else if (r >= 25) {
                r -= 25;
                quarter++;
            } else if (r >= 10) {
                r -= 10;
                dime++;
            } else if (r >= 5) {//stuck here sometimes, may be bc of decimals. Debugger would say the statement is true, but wouldn't jump into it.
                r -= 5;
                nickel++;
            }
        }
        System.out.println("Please take your change: ");
        System.out.println(twenty + " $20 bills / " + ten + " $10 bills / " + five + " $5 bills / " + one + " $1 bills / " + quarter + " quarters / " + dime + " dimes / " + nickel + " nickels \n");
    }

    public void quit() {
        System.out.println("Thank you for visiting!!");
    }

    public void printSoldOutMessage() {
        System.out.println("The item you have selected is sold out. \n");
    }

    public void printInsufficientStockMessage() {
        System.out.println("The item you have selected does not have enough stock. \n");
    }

    public void printInsufficientBalance() {
        System.out.println("Insufficient balance. Please add more money! \n");
    }

    public void printItemDoesNotExist() {
        System.out.println("The product code you have selected does not exist. \n");
    }

}
