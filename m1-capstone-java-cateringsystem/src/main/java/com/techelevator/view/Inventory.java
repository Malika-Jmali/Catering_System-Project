package com.techelevator.view;

import com.techelevator.Product;

import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {

    private Map<String, Product> inventoryMap;
    private ReaderFile readerFile;

    public Inventory() throws FileNotFoundException {
        readerFile = new ReaderFile();
        inventoryMap = readerFile.loadData();
    }

    public List<Product> retrieveAllItems() {

        List<Product> everything = new ArrayList<>();

        Set<String> keys = inventoryMap.keySet();
        for( String key: keys) {
            everything.add(inventoryMap.get(key));
        }
        return everything;
    }

    public Product retrieveItemByProductCode(String productCode) {

       return inventoryMap.get(productCode);
    }

    public void reduceInventory(String code, int purchaseQuantity) { //quantityOfInventory - purchaseQuantity
        inventoryMap.get(code).setQuantity(inventoryMap.get(code).getQuantity() - purchaseQuantity);
    }

}
