package com.techelevator.view;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;

    public UserInterface(){
        scanner= new Scanner(System.in);
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
        System.out.println(" (3) Complete Transaction");

        String choice= scanner.nextLine();
        return choice;

    }
    // kind of looks like a menu class if you ask me ;-)
	
}
