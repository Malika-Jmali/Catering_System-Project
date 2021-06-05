package com.techelevator.view;

import com.techelevator.Product;

public class Appetizer extends Product {

    private int quantity;

    public Appetizer(String code, String name, double price, String type) {
        super(code, name, price, type);
    }

    @Override
    public int updateQuantity(int quantitySelected) {
        return quantity -= quantitySelected;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}
