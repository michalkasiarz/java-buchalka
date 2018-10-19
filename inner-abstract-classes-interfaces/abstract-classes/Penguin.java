public class Penguin extends Bird {
    // calling constructor from parent class
    public Penguin(String name) {
        super(name);
    }

    // overriding fly() method
    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
