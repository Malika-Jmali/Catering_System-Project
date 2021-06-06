package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashRegisterTest {

    @Test
    public void addMoney() {

        //Arrange
        CashRegister money = new CashRegister(0); //two kind of tests, instantiate new obj, check out delta
        //Act and Assert
        Assert.assertEquals(400.00, money.addMoney(400.00), 0.1);
        Assert.assertEquals(800.00,money.addMoney(400.00),0.1);
//        Assert.assertEquals(0, money.addMoney(5001),0.1);

    }
    @Test
    public void addMoneyAbove5000() {

        //Arrange
        CashRegister money = new CashRegister(0); //two kind of tests, instantiate new obj, check out delta
        //Act and Assert
        Assert.assertEquals(400.00, money.addMoney(400.00), 0.1);
        Assert.assertEquals(400.00,money.addMoney(5000.00),0.1);


    }

    @Test
    public void reduceBalance() {
        //Arrange
        CashRegister money1 = new CashRegister(500);
        Assert.assertEquals(250, money1.reduceBalance(25.00,10),2);
    }
}