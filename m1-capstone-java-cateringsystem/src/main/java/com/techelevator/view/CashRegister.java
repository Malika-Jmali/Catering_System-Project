package com.techelevator.view;

import com.techelevator.CateringSystemCLI;

public class CashRegister {

    //instance variable
   private double balance = 0;


   //constructor
   public CashRegister(double balance) {
       this.balance = balance;
    }

    //getter/setter
    public double getBalance() {
       return balance;
    }

    public void setBalance(double balance) {
       this.balance = balance;
    }

    //methods
    public double addMoney(double dollar){
        balance= balance + dollar;
        return balance;
    }

    public double giveChange(double totalCost){
       balance = balance - totalCost;
       return balance;
    }
// using the smallest amount of bills and coins possible
    // The customer’s current balance should be updated to \$0 remaining.



}
