package com.example.activities.six.model;

public abstract class Customer {
    private String name;
    private double balance;
    private String cart;
    private double cartCost;

    public Customer() {
        this("", 0.0, "", 0.0);
    }

    public Customer(String name, double balance, String cart, double cartCost) {
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    public void addToCart(String item, double cost) {
        this.cart = this.cart + item;
        this.cartCost = this.cartCost + cost;
    }

    public abstract void buy();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public double getCartCost() {
        return cartCost;
    }

    public void setCartCost(double cartCost) {
        this.cartCost = cartCost;
    }
}
