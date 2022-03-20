package com.example.activities.six;

import java.util.List;

public class PremiumCustomer extends Customer implements Premium {
    private int cardNumber;
    int years;

    public PremiumCustomer() {
        super();
    }
    public PremiumCustomer(String name, int balance, List<String> cart, int cartCost, int cardNumber, int years) {
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
//    - implement the buy method, which should remove the items from the cart, and reset the balance property
//
//	- implement the getters and setters for the premium user
//
//	- Override the toString method from the object class to include all properties from the
//	  Abstract class, interface, and Concrete class