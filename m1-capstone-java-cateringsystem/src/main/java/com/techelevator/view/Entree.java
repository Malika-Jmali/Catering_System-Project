package com.techelevator.view;

import com.techelevator.Product;

public class Entree extends Product {

    private int quantity;

    public Entree(String code, String name, double price, String type) {

        super(code, name, price, type);
        this.quantity = quantity;
    }

    @Override
    public int addQuantity(int quantitySelected) {
        return quantitySelected;
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
        return "Entree";
    }
}

