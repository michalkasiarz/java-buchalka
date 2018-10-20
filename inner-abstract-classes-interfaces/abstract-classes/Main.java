public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Odys");
        dog.breathe();
        dog.eat();
        dog.bark();

        Parrot parrot = new Parrot("Polly");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        Cat myCat = new Cat("Parys");
        myCat.meow();
        myCat.eat();
    }
}
