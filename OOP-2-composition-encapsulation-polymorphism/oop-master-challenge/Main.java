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

        // burger with 4 additions
        karolHamburger.addAddition(lettuce, ketchup, tomato, drink);
        karolHamburger.showTheFinalPrice();
        System.out.println();
        // burger with 3 additions
        ivanHamburger.addAddition(tomato, potato, ketchup);
        ivanHamburger.showTheFinalPrice();
        System.out.println();
        // burger with 2 additions
        dubaskaHamburger.addAddition(cucumber, lettuce);
        dubaskaHamburger.showTheFinalPrice();
        System.out.println();
        // burger with 1 addition
        myHamburger.addAddition(chips);
        myHamburger.showTheFinalPrice();






        // TODO:
        // super from sub-class - price (?)
        // counting price for deluxe burger (?0

        // DONE:
        // to deal with nullPointerException

    }
}
