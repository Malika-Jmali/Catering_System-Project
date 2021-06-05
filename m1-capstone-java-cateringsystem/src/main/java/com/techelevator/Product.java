package com.techelevator;

public class Product {

    //instance variables
    private  String code;
    private  String name;
    private  double price;
    private  String type;
    private  int quantity;

    public Product(String code, String name, double price, String type) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public Product() {

    }

    //method
    public int addQuantity(int quantitySelected) {
        return quantitySelected;
    }


    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() { return quantity; }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantitySelected) {

        quantity = quantity - quantitySelected;
    }

    public String toString(){
        return getName()+ getType()+ getPrice()+ getQuantity()+ getCode();
    }
}
