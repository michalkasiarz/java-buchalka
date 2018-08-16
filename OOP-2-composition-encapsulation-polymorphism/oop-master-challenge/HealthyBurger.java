package com.michal;

public class HealthyBurger extends Hamburger {

    private Addition fifthAddition;
    private Addition sixthAddition;
    private double finalPrice;

    public HealthyBurger(String meat, RollType rollType, double standardPrice) {
        super(meat, rollType, standardPrice);
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition, Addition fourthAddition, Addition fifthAddition) {
        setFirstAddition(firstAddition);
        setSecondAddition(secondAddition);
        setThirdAddition(thirdAddition);
        setFourthAddition(fourthAddition);
        this.fifthAddition = fifthAddition;
        this.finalPrice = getStandardPrice() + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice() + fourthAddition.getPrice() + fifthAddition.getPrice();
        setAdditionsQuantity(5);
        return this.finalPrice;
    }

    public double addAddition(Addition firstAddition, Addition secondAddition, Addition thirdAddition, Addition fourthAddition, Addition fifthAddition, Addition sixthAddition) {
        setFirstAddition(firstAddition);
        setSecondAddition(secondAddition);
        setThirdAddition(thirdAddition);
        setFourthAddition(fourthAddition);
        this.fifthAddition = fifthAddition;
        this.sixthAddition = sixthAddition;
        this.finalPrice = getStandardPrice() + firstAddition.getPrice() + secondAddition.getPrice() + thirdAddition.getPrice() + fourthAddition.getPrice() + fifthAddition.getPrice() + sixthAddition.getPrice();
        setAdditionsQuantity(6);
        return this.finalPrice;
    }

    @Override
    public void showTheStandardPrice() {
        System.out.println("The standard price of the Healthy Burger (with no additions) is: " + getStandardPrice() + " PLN.");
    }

    public void showTheFinalPrice() {
        if (finalPrice != getStandardPrice()) {
            switch (getAdditionsQuantity()) {
                case 1:
                    System.out.println("The final price of the Healthy Burger (base: " + getStandardPrice() + " PLN) with following additions: " + getFirstAddition().getName() + " (" + getFirstAddition().getPrice() + "), is " + getFinalPrice() + " PLN.");
                    break;
                case 2:
                    System.out.println("The final price of the Healthy Burger (base: " + getStandardPrice() + " PLN) with following additions: " + getFirstAddition().getName() + " (" + getFirstAddition().getPrice() + "), " + getSecondAddition().getName() + " (" + getSecondAddition().getPrice() + "), is " + getFinalPrice() + " PLN.");
                    break;
                case 3:
                    System.out.println("The final price of the Healthy Burger (base: " + getStandardPrice() + " PLN) with following additions: " + getFirstAddition().getName() + " (" + getFirstAddition().getPrice() + "), " + getSecondAddition().getName() + " (" + getSecondAddition().getPrice() + "), " + getThirdAddition().getName() + " (" + getThirdAddition().getPrice() + "), is " + getFinalPrice() + " PLN.");
                    break;
                case 4:
                    System.out.println("The final price of the Healthy Burger (base: " + getStandardPrice() + " PLN) with following additions: " + getFirstAddition().getName() + " (" + getFirstAddition().getPrice() + "), " + getSecondAddition().getName() + " (" + getSecondAddition().getPrice() + "), " + getThirdAddition().getName() + " (" + getThirdAddition().getPrice() + "), " + getFourthAddition().getName() + " (" + getFourthAddition().getPrice() + "), is " + getFinalPrice() + " PLN.");
                    break;
                case 5:
                    System.out.println("The final price of the Healthy Burger (base: " + getStandardPrice() + " PLN) with following additions: " + getFirstAddition().getName() + " (" + getFirstAddition().getPrice() + "), " + getSecondAddition().getName() + " (" + getSecondAddition().getPrice() + "), " + getThirdAddition().getName() + " (" + getThirdAddition().getPrice() + "), " + getFourthAddition().getName() + " (" + getFourthAddition().getPrice() + "), " + fifthAddition.getName() + " (" + fifthAddition.getPrice() + "), is " + this.finalPrice + " PLN.");
                    break;
                case 6:
                    System.out.println("The final price of the Healthy Burger (base: " + getStandardPrice() + " PLN) with following additions: " + getFirstAddition().getName() + " (" + getFirstAddition().getPrice() + "), " + getSecondAddition().getName() + " (" + getSecondAddition().getPrice() + "), " + getThirdAddition().getName() + " (" + getThirdAddition().getPrice() + "), " + getFourthAddition().getName() + " (" + getFourthAddition().getPrice() + "), " + fifthAddition.getName() + " (" + fifthAddition.getPrice() + "), " + sixthAddition.getName() + " (" + sixthAddition.getPrice() + "), is " + this.finalPrice + " PLN.");
                    break;
            }
        } else {
            System.out.println("The final price of the Healthy Burger is " + getStandardPrice() + " PLN, since you've selected no additions.");

        }
    }




}

