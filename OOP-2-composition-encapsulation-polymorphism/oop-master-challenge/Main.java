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

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("chicken", white, 9.40, chips, drink);
        HealthyBurger oneHealthyBurger = new HealthyBurger("chicken", white, 13.5);
        HealthyBurger secondHealthyBurger = new HealthyBurger("chicken", white, 11.70);
        HealthyBurger thirdHealthyBurger = new HealthyBurger("chicken", white, 9.30);
        HealthyBurger fourthHealthyBurger = new HealthyBurger("chicken", white, 5.30);

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
        System.out.println();
        // Deluxe Hamburger which comes with chips and a drink
        deluxeHamburger.showTheFinalPrice();
        System.out.println();
        // Healthy burger with 1 addition;
        oneHealthyBurger.addAddition(ketchup);
        oneHealthyBurger.showTheStandardPrice();
        oneHealthyBurger.showTheFinalPrice();
        System.out.println();
        // Healthy burger with two additions
        secondHealthyBurger.addAddition(lettuce, potato);
        secondHealthyBurger.showTheStandardPrice();
        secondHealthyBurger.showTheFinalPrice();
        System.out.println();
        // Healthy burger with 5 additions
        thirdHealthyBurger.addAddition(lettuce, potato, tomato, tomato, tomato);
        thirdHealthyBurger.showTheStandardPrice();
        thirdHealthyBurger.showTheFinalPrice();
        System.out.println();
        // Healthy burger with 6 additions
        fourthHealthyBurger.addAddition(tomato, potato, tomato, ketchup, cucumber, chips);
        fourthHealthyBurger.showTheStandardPrice();
        fourthHealthyBurger.showTheFinalPrice();





        // TODO:
        // should do some refactoring with overriding and overloading methods

        // DONE:
        // to deal with nullPointerException
        // printing the value of the base, each addition and total sum of each type of burger

    }
}
