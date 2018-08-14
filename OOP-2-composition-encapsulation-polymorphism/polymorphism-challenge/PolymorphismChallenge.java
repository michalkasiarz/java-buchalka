class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Engine started";
    }

    public String accelerate() {
        return "Car accelerated";
    }

    public String brake() {
        return "Car stopped";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Karoq extends Car {

    public Karoq() {
        super("Karoq", 2311);
    }

    @Override
    public String startEngine() {
        return "Karoq has a very powerful engine. You've pressed the button but it started very quietly.";
    }

    @Override
    public String accelerate() {
        return "Karoq accelerated quite well.";
    }

    @Override
    public String brake() {
        return "Karoq has a very good brakes!";
    }
}

class Mazda extends Car {

    public Mazda() {
        super("Mazda 6", 2600);
    }

    @Override
    public String startEngine() {
        return "You've started the engine with your key. Mazda still has it.";
    }

    @Override
    public String accelerate() {
        return "Mazda 6 has definitely better acceleration than any SUV!";
    }

    @Override
    public String brake() {
        return "ABS works fine in Mazda.";
    }
}

class Malczan extends Car {

    public Malczan() {
        super("Fiat 126p", 250);
    }

    @Override
    public String startEngine() {
        return "You've started the engine of your Malczan. That's a real success!";
    }

    @Override
    public String accelerate() {
        return "Malczan does not accelerate. Never. Or, at least, it seems that it does not.";
    }

    @Override
    public String brake() {
        return "You've pushed a brake at your Malczan. That was scary!";
    }
}

public class PolymorphismChallenge {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("\nDrawing lots..." + "\n\nCar # " + i + " : " + car.getName() + "\n" + "Engine: " + car.startEngine() + "\n" + "Acceleration: " + car.accelerate() + "\n" + "Brakes: " + car.brake() + "\n");
        }
    }

    public static Car randomCar() {
        int randomCarNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated was: " + randomCarNumber);

        switch (randomCarNumber) {
            case 1: case 4: case 8:
                return new Karoq();
            case 2: case 5: case 9:
                return new Mazda();
            case 3: case 6: case 7:
                return new Malczan();
            default:
                return null;
        }
    }
}
