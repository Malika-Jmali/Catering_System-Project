package com.techelevator.view;

import com.techelevator.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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
        //Arrange

        //Act and Assert
        Product test2 = new Appetizer("A1", "Tropical Fruit Bowl", 3.50, "A");
        Assert.assertEquals(test2.getType(), allItems.retrieveItemByProductCode("A1").getType());
    }

//    @Test
//    public void reduceInventory() throws FileNotFoundException {
//
//        //Arrange
//        Inventory reduceTest = new Inventory();
//        //Act and Assert
//        Assert.assertEquals(47,reduceTest.reduceInventory("A1",3));
//    }
}