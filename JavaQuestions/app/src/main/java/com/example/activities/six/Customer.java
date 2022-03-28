package com.example.activities.six;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    public static String name;
    public static int balance;
    public static ArrayList<String> cart = new ArrayList<>();
    public static ArrayList<Integer> cartCost = new ArrayList<Integer>();

    public Customer(String name, int balance, ArrayList<String> cart, ArrayList<Integer> cartCost) {
        this.name = name;
        this.balance = balance;
        this.cart = (ArrayList<String>) cart;
        this.cartCost = (ArrayList<Integer>) cartCost;
    }

    public Customer() {

    }

    public List<String> addToCart(String item, int cost) {
        cart.add(item);
        cartCost.add(cost);
        return cart;
    }

    public abstract void buy();
}
