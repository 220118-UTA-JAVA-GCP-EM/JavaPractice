package com.example.activities.six;

public abstract class Customer {

    public String name;
    public double balance;
    public String cart;
    public double cartCost;

    public Customer(String name, double balance, String cart, double cartCost) {
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    public String addToCart(String item, int cost){

        cart += item + "\n";
        cartCost += cost;
        balance += cost;

        return cart;
    }

    public abstract void buy();
}
