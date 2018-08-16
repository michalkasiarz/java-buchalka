package com.michal;

public class Hamburger {

    private String meat;
    private RollType breadRoll;
    private double standardPrice;
    private double finalPrice;
    private Addition firstAddition;
    private Addition secondAddition;
    private Addition thirdAddition;
    private Addition fourthAddition;
    private int additionsQuantity;

    public Hamburger(String meat, RollType rollType, double standardPrice) {
        this.meat = meat;
        this.breadRoll = rollType;
        this.standardPrice = standardPrice;
    }

    public double addAddition(Addition firstAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice();
        this.firstAddition = firstAddition;
        additionsQuantity = 1;
        return finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice() + secondAddition.getPrice();
        this.firstAddition = firstAddition;
        this.secondAddition = secondAddition;
        additionsQuantity = 2;
        return finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice();
        this.firstAddition = firstAddition;
        this.secondAddition = secondAddition;
        this.thirdAddition = thirdAddition;
        additionsQuantity = 3;
        return finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition, Addition fourthAddition) {
        finalPrice = this.standardPrice + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice() + fourthAddition.getPrice();
        this.firstAddition = firstAddition;
        this.secondAddition = secondAddition;
        this.thirdAddition = thirdAddition;
        this.fourthAddition = fourthAddition;
        additionsQuantity = 4;
        return finalPrice;
    }

    public void showTheStandardPrice() {
        System.out.println("The standard price of the hamburger (with no additions) is: " + getStandardPrice() + " PLN.");
    }

    public void showTheFinalPrice() {
        if (finalPrice != getStandardPrice()) {
            switch (additionsQuantity) {
                case 1:
                    System.out.println("The final price of the burger (base: " + getStandardPrice() + " PLN) with following additions: " + firstAddition.getName() + " (" + firstAddition.getPrice() + "), is " + finalPrice + " PLN.");
                    break;
                case 2:
                    System.out.println("The final price of the burger (base: " + getStandardPrice() + " PLN) with following additions: " + firstAddition.getName() + " (" + firstAddition.getPrice() + "), " + secondAddition.getName() + " (" + secondAddition.getPrice() + "), is " + finalPrice + " PLN.");
                    break;
                case 3:
                    System.out.println("The final price of the burger (base: " + getStandardPrice() + " PLN) with following additions: " + firstAddition.getName() + " (" + firstAddition.getPrice() + "), " + secondAddition.getName() + " (" + secondAddition.getPrice() + "), " + thirdAddition.getName() + " (" + thirdAddition.getPrice() + "), is " + finalPrice + " PLN.");
                    break;
                case 4:
                    System.out.println("The final price of the burger (base: " + getStandardPrice() + " PLN) with following additions: " + firstAddition.getName() + " (" + firstAddition.getPrice() + "), " + secondAddition.getName() + " (" + secondAddition.getPrice() + "), " + thirdAddition.getName() + " (" + thirdAddition.getPrice() + "), " + fourthAddition.getName() + " (" + fourthAddition.getPrice() + "), is " + finalPrice + " PLN.");
                    break;
            }
        } else {
            System.out.println("The final price of the hamburger is " + getStandardPrice() + " PLN, since you've selected no additions.");

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
