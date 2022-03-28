package com.example.activities.six;

import java.util.ArrayList;

public class PremiumCustomer extends Customer implements Premium {
    private int cardNumber;
    private int years;

    public PremiumCustomer() {
        super();
    }

    public PremiumCustomer(String name, int balance, ArrayList<String> cart, ArrayList<Integer> cartCost, int cardNumber, int years) {
        super(name, balance, cart, cartCost);
        this.cardNumber = cardNumber;
        this.years = years;
    }

    @Override
    public void buy() {

    }

    @Override
    public int discountPrice(int price) {
        return 0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
//3. Create a class called PremiumCustomer that:
//	- extends Customer, and implements Premium
//
//	- has private properties vipCard which is their card number, an integer years
//	  which keeps track of the number of years they have been vip
//
//	- The PremiumCustomer should have a no-args constructor, and an all args
//	  constructor that allows you to set the properties of the Customer class,
//	  and the properties of the PremiumCustomer, HINT (think about the super() keyword)
//
//	- implement the discountPrice methods so that the premium user gets a discount
//	  of 15% on all items in their cart, and sets the balance property
//
//   - implement the buy method, which should remove the items from the cart, and reset the balance property
//
//	- implement the getters and setters for the premium user
//
//	- Override the toString method from the object class to include all properties from the
//	  Abstract class, interface, and Concrete class