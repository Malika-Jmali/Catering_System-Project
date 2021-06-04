package com.techelevator.view;

import com.techelevator.Product;

import java.util.List;

public class ShoppingCart {

    private List<Product> productsSelected;

    public void addItems(Product items){

        productsSelected.add(items);
    }

    public void emptyCart(){
        productsSelected.clear();
    }


    public List<Product> getShoppingCartItem(){
        return productsSelected;

    }

// public List getShoppingCartItem (quantity, type, product, itemCost)
    // Transaction
    /*If the product code does not exist, the customer is informed that the product code they selected does not exist and the customer is returned to the Purchase menu (sub-menu).
If a product is sold out, the customer is informed and returned to the Purchase menu (sub menu).*/
}
