package com.techelevator.view;

import com.techelevator.Product;

public class Dessert extends Product {

    private int quantity;

    public Dessert(String code, String name, double price, String type) {

        super(code, name, price, type);
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Dessert";
    }
}
