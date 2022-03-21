package com.example.activities.six;

import java.util.List;

public abstract class Customer {
    public static String name;
    public static int balance;
    public static List<String> cart;
    public static int cartCost;

    public Customer(String name, int balance, List<String> cart, int cartCost) {
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    public Customer() {

    }

    public List<String> addToCart(String item, int cost) {
        cart.add(item);
        cartCost += cost;
        return cart;
    }

    public abstract void buy();
}
