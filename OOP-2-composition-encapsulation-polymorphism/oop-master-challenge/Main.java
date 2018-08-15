package com.michal;

public class Main {

    public static void main(String[] args) {
        RollType white = new RollType("White");
        Addition lettuce = new Addition("Lettuce", 2.50);
        Addition potato = new Addition("Potato", 3.00);
        Addition ketchup = new Addition("Ketchup", 5.40);
        Addition cucumber = new Addition("Cucumber", 1.40);
        Addition chips = new Addition("Chips", 3.00);
        Addition drink = new Addition("Drink", 3.50);
        Addition tomato = new Addition("Tomato", 4.70);

        Hamburger myHamburger = new Hamburger("Chicken", white, 7.40);

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Chicken", white, 12.50, chips, drink);

        myHamburger.showTheStandardPrice();
        myHamburger.showTheFinalPrice();
        myHamburger.addAddition(cucumber, potato, lettuce, tomato);
        myHamburger.showTheFinalPrice();




        // TODO:
        // super from sub-class - price
        // counting price for deluxe burger

    }
}
