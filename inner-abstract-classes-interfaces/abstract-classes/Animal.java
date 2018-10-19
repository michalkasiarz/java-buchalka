
public abstract class Animal {
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    // abstract methods
    public abstract void eat();
    public abstract void breathe();

    // getter
    public String getName() {
        return name;
    }
}
