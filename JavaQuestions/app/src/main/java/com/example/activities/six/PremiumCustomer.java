package com.example.activities.six;

public class PremiumCustomer extends Customer implements Premium{

    private int vipCard;
    private int years;


    public PremiumCustomer() {
        super("Unnamed", 0, "", 0);
    }

    public PremiumCustomer(String name, double balance, String cart, double cartCost, int vipCard, int years) {
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    @Override
    public void buy() {
        cart = "";
        balance = 0;
        cartCost = 0;
    }

    @Override
    public double discountPrice(int disc) {
        double discFactor = disc;
        discFactor = discFactor/100;
        balance = balance*(1 - discFactor);
        return balance;
    }

    @Override
    public String toString() {
        return "PremiumCustomer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", cart='" + cart + '\'' +
                ", cartCost=" + cartCost +
                ", vipCard=" + vipCard +
                ", years=" + years +
                '}';
    }
}
