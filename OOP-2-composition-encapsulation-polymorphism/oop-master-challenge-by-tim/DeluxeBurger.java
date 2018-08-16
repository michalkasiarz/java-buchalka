public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "Whire");
        super.addHamburgerAdditon1("Chips", 2.75);
        super.addHamburgerAdditon2("Drink", 1.818);
    }

    @Override
    public void addHamburgerAdditon1(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAdditon2(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAdditon3(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAdditon4(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }
}
