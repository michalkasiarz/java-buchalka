public class Dog extends Animal {

    // calling constructor from parent class
    public Dog(String name) {
        super(name);
    }

    // overriding eat() method
    @Override
    public void eat() {
        System.out.println(getName() + " chews");
    }

    // overriding breathe() method
    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out. ");
    }

    public void bark() {
        System.out.println(getName() + " is barking!");
    }
}
