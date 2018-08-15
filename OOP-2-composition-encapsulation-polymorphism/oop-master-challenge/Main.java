package com.michal;

public class Main {

    public static void main(String[] args) {
        RollType white = new RollType("white");
        Addition lettuce = new Addition("lettuce", 2.50);
        Addition potato = new Addition("potato", 3.00);
        Addition ketchup = new Addition("ketchup", 5.40);
        Addition cucumber = new Addition("cucumber", 1.40);
        Addition chips = new Addition("chips", 3.00);
        Addition drink = new Addition("drink", 3.50);
        Addition tomato = new Addition("tomato", 4.70);

        Hamburger myHamburger = new Hamburger("chicken", white, 7.40);
        Hamburger ivanHamburger = new Hamburger("chicken", white, 7.40);
        Hamburger dubaskaHamburger = new Hamburger("chicken", white, 7.40);
        Hamburger karolHamburger = new Hamburger("chicken", white, 7.40);


        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("chicken", white, 12.50, chips, drink);

        karolHamburger.addAddition(lettuce, ketchup, tomato, drink);
        karolHamburger.showTheStandardPrice();
        karolHamburger.showTheFinalPrice();





        // TODO:
        // super from sub-class - price (?)
        // counting price for deluxe burger (?0
        // to deal with nullPointerException (casting problem?) with double value

    }
}
