package com.techelevator.view;

import com.techelevator.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReaderFile {

    private Scanner scanner;
    private File inventoryFile;

    public ReaderFile() {
        inventoryFile = new File("cateringsystem.csv");
    }


    public Map<String, Product> loadData() throws FileNotFoundException {


        Map<String, Product> allItems = new TreeMap<>();

        scanner = new Scanner(inventoryFile);

        while(scanner.hasNextLine()) {

            String record = scanner.nextLine();
            String[] fields = record.split("\\|");

            Product product = new Appetizer();
//            Product product = new Product(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3]);
            allItems.put(fields[0], product);
        }

        return allItems;

}

//    public static void main(String[] args) {
//
//    }




}
