package com.michal;

public class DeluxeHamburger extends Hamburger {

    private Addition chips;
    private Addition drink;
    private double price;

    public DeluxeHamburger(String meat, RollType rollType, double price, Addition chips, Addition drink) {
        super(meat, rollType, price + chips.getPrice() + drink.getPrice());
        this.chips = chips;
        this.drink = drink;
    }

    public double getStandardPrice() {
        this.price = price + chips.getPrice() + drink.getPrice();
        System.out.println(this.price);
        return this.price;
    }
}
