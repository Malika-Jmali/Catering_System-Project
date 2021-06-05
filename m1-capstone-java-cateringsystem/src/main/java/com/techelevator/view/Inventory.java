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

    public List<Product> retrieveItemByProductCode(String productCode) {

        List<Product> itemByCode = new ArrayList<>();

        for(Product product : inventoryMap.values()) {
            if (product.getCode().equals(productCode)) {
                itemByCode.add(product);
            }

        }
            return itemByCode;
    }







}
