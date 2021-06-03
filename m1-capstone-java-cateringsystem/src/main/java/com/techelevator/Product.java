package com.techelevator;

public class Product {
    private  String name;
    private  String type;
    private  String code;
    private  double price;
    private  int quantity;

    public Product() {
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

    public int getQuantity() {
        return quantity;
    }

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString(){
        return getName()+ getType()+ getPrice()+ getQuantity()+ getCode();
    }
}
