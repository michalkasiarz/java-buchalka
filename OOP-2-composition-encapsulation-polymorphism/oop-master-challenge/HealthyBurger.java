package com.michal;

public class HealthyBurger extends Hamburger {

    private Addition fifthAddition;
    private Addition sixthAddition;
    private double price;

    public HealthyBurger(String meat, RollType rollType, double price) {
        super(meat, rollType, price);
    }


    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition, Addition fourthAddition, Addition fifthAddition) {
        double finalPrice = this.price + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice() + fourthAddition.getPrice() + fifthAddition.getPrice();
        System.out.println(finalPrice);
        return this.price = finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition, Addition fourthAddition, Addition fifthAddition, Addition sixthAddition) {
        double finalPrice = this.price + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice() + fourthAddition.getPrice() + fifthAddition.getPrice() + sixthAddition.getPrice();
        System.out.println(finalPrice);
        return this.price = finalPrice;
    }

}

