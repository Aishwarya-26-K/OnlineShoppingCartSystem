package com.myshop.OnlineShoppingCart.model;

public class Product {
    private final int id;
    private final String name;
    private final double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Setter for mutable field(s)
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return id + ". " + name + " - ₹" + price + " (Stock: " + stock + ")";
    }
}


