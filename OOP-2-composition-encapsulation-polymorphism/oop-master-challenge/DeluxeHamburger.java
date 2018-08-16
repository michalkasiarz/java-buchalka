package com.michal;

public class DeluxeHamburger extends Hamburger {

    private Addition chips;
    private Addition drink;

    public DeluxeHamburger(String meat, RollType rollType, double standardPrice, Addition chips, Addition drink) {
        super(meat, rollType, standardPrice);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public void showTheFinalPrice() {
        System.out.println("The final price of the Deluxe burger (base: " + getStandardPrice() + " PLN), which comes with " + this.chips.getName() + " ("+ this.chips.getPrice() + ") and " + this.drink.getName() + " (" + this.drink.getPrice() + ") as additions is " + (getStandardPrice() + chips.getPrice() + drink.getPrice()) + " PLN.");
    }

    @Override
    public void showTheStandardPrice() {
       System.out.println("The standard price of the Deluxe burger (with no additions) is: " + getStandardPrice() + " PLN.");
    }
}
