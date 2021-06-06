package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashRegisterTest {

    @Test
    public void addMoney() {

        //Arrange
        CashRegister money = new CashRegister(0);
        //Act and Assert
        Assert.assertEquals(0, money.addMoney(5001.00), 0.01);
        Assert.assertEquals(400.00, money.addMoney(400.00), 0.01);
        Assert.assertEquals(1364.00,money.addMoney(964.00),0.01);

    }
    @Test
    public void addMoneyAbove5000() {

        //Arrange
        CashRegister money = new CashRegister(0);
        //Act and Assert
        Assert.assertEquals(400.00, money.addMoney(400.00), 0.01);
        Assert.assertEquals(400.00,money.addMoney(5000.00),0.01);
        Assert.assertEquals(523.00,money.addMoney(123.00),0.01);


    }

    @Test
    public void reduceBalance() {

        CashRegister money1 = new CashRegister(500);
        Assert.assertEquals(250, money1.reduceBalance(25.00,10),0.01);
        Assert.assertEquals(145, money1.reduceBalance(35, 3), 0.01);
    }
}