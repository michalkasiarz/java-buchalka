public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " meows firstly and then eats.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathes so quietly.");
    }

    public void meow() {
        System.out.println("Meooowwww!");
    }
}
