package com.techelevator.view;

import com.techelevator.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;


public class InventoryTest {

    Inventory allItems = null;

    @Before
    public void setup() {
        try{
            allItems = new Inventory();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void retrieveAllItems() {

        List<Product> product = allItems.retrieveAllItems();
        Assert.assertEquals(18, product.size());

    }

    @Test
    public void retrieveItemByProductCode() {

        //Act and Assert
        Product test2 = new Appetizer("A1", "Tropical Fruit Bowl", 3.50, "A");
        Assert.assertEquals(test2.getType(), allItems.retrieveItemByProductCode("A1").getType());
        Assert.assertEquals(test2.getName(), allItems.retrieveItemByProductCode("A1").getName());
    }
    @Test
    public void retrieveItemByProductCodeBeverage() {

        //Act and Assert
        Product test3 = new Beverage("B1", "Soda", 1.50, "B");
        Assert.assertEquals(test3.getCode(), allItems.retrieveItemByProductCode("B1").getCode());
        Assert.assertEquals(test3.getName(), allItems.retrieveItemByProductCode("B1").getName());
        Assert.assertEquals(1.50, allItems.retrieveItemByProductCode("B1").getPrice(), 0.01);
    }

}