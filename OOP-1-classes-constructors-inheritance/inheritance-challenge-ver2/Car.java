
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int wheels, int doors, int gears, boolean isManual) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear changed to " + this.currentGear + ".");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car speed " + speed + ", direction: " + direction + ".");
        move(speed, direction);
    }
}
