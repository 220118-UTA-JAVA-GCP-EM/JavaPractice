package com.example.activities.six;

public class PremiumCustomer extends Customer implements Premium{

    private int vipCard;
    private int years;


    public PremiumCustomer(String name, double balance, String cart, double cartCost) {
        super(name, balance, cart, cartCost);
    }

    public PremiumCustomer(String name, double balance, String cart, double cartCost, int vipCard, int years) {
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    @Override
    public void buy() {
        c
    }

    @Override
    public double discountPrice(int disc) {
        return balance*disc/100;
    }
}
