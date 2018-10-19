public class Parrot extends Bird {

    // calling constructor from parent class
    public Parrot(String name) {
        super(name);
    }

    // overriding fly() method
    @Override
    public void fly() {
        System.out.println("Flies from one furniture to another. Bites all of 'em!");
    }
}
