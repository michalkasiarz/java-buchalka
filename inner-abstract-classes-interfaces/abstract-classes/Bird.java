
public abstract class Bird extends Animal {
// calling constructor from parent class using 'super' keyword
    public Bird(String name) {
        super(name);
    }

    // overriding eat() method
    @Override
    public void eat() {
        System.out.println(getName() + " pecks");
    }

    // overriding breathe() method
    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out.");

    }
    // adding a specific method for birds: fly()
    public abstract void fly();
}
