package com.techelevator.view;

import com.techelevator.Product;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

public class Inventory {

    private Map<String, Product> inventoryMap;
    private ReaderFile readerFile;

    public Inventory() throws FileNotFoundException {
        readerFile = new ReaderFile();
        inventoryMap = readerFile.loadData();
    }










}
