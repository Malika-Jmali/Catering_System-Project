package com.techelevator.view;


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
    public double addMoney(double dollar) {
        if (balance + dollar > 5000) {
            this.balance = balance;
        } else {
            this.balance = balance + dollar;
        }
        return this.balance;
    }

    public double minusMoney(double price, int quantity) {
       this.balance = balance - (price * quantity);
       return balance;
    }

    public double giveChange(double totalCost){
       balance = balance - totalCost;
       return balance;
    }
// using the smallest amount of bills and coins possible
    // The customer’s current balance should be updated to \$0 remaining.



}
