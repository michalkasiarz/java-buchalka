package com.michal;

public class Hamburger {

    private String meat;
    private RollType breadRoll;
    private double standardPrice;
    private double finalPrice;

    public Hamburger(String meat, RollType rollType, double standardPrice) {
        this.meat = meat;
        this.breadRoll = rollType;
        this.standardPrice = standardPrice;
    }

    public double addAddition(Addition firstAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice();
        return finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice() + secondAddition.getPrice();
        return finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice();
        return finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition, Addition fourthAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice() + fourthAddition.getPrice();
        return finalPrice;
    }

    public void showTheStandardPrice() {
        System.out.println("The standard price of the hamburger (with no additions) is: " + getStandardPrice() + " PLN.");
    }

    public void showTheFinalPrice() {
        if(finalPrice > 0) {
            System.out.println("The final price of the hamburger with selected additions is " + finalPrice + " PLN.");
        } else {
            System.out.println("The final price of the burger is " + getStandardPrice() + ", since you've selected no additions.");
        }
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public String getMeat() {
        return meat;
    }

    public RollType getBreadRoll() {
        return breadRoll;
    }
}
