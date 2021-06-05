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

            if (fields[3].equals("A")) {
                Product product = new Appetizer(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3], 50);
                allItems.put(fields[0], product);
            }
            if (fields[3].equals("B")) {
                Product product1 = new Beverage(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3], 50);
                allItems.put(fields[0], product1);
            }
            if (fields[3].equals("D")) {
                Product product2 = new Dessert(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3], 50);
                allItems.put(fields[0], product2);
            }
            if (fields[3].equals("E")) {
                Product product3 = new Entree(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3], 50);
                allItems.put(fields[0], product3);
            }

        }

        return allItems;

}

    public static void main(String[] args) {

    }




}
