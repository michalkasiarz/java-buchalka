public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAdditon1("Tomato", 0.27);
        hamburger.addHamburgerAdditon2("Lettuce", 0.75);
        hamburger.addHamburgerAdditon3("Cheese", 1.13);

        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAdditon1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAdditon1("Cucumber", 1.12);
    }
}
