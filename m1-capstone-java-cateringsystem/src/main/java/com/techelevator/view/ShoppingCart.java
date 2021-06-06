package com.techelevator.view;

import com.techelevator.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productsSelected = new ArrayList<>();

    public void addItem(String code, String name, double price, String type, int quantity){
        Product itemToBeAdded = new Product();
        itemToBeAdded.setCode(code);
        itemToBeAdded.setName(name);
        itemToBeAdded.setPrice(price);
        itemToBeAdded.setType(type);
        itemToBeAdded.setQuantity(quantity);
        productsSelected.add(itemToBeAdded);
    }

    public void emptyCart(){
        productsSelected.clear();
    }

    public List<Product> getShoppingCartItem(){
        return productsSelected;

    }

}
