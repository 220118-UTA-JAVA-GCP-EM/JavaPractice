package com.example.activities.six.model;

public class PremiumCustomer extends Customer implements Premium {

    private int vipCard;
    private int years;

    public PremiumCustomer() {
        this("", 0.0, "", 0.0, 0, 0);
    }

    public PremiumCustomer(String name, double balance, String cart, double cartCost, int vipCard, int years) {
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;

    }

    @Override
    public void buy() {
        super.setCart(null);
        super.setBalance(0.0);
    }

    @Override
    public double discountPrice(double cartCost) {
        double discountedPrice = cartCost - (cartCost * .15);
        return discountedPrice;
    }

    public int getVipCard() {
        return vipCard;
    }

    public void setVipCard(int vipCard) {
        this.vipCard = vipCard;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Customer [name= " + super.getName() +
                        ", balance= " + super.getBalance() +
                        ", cart= " + super.getCart() +
                        ", cartCost= " + super.getCartCost() + "]" +
                "\nPremium [title= " + title + "]" +
                "\nPremiumCustomer [vipCard= " + vipCard +
                        ", years= " + years + "]";
    }
}
