
public class Vehicle {
    private String name;

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        // every vehicle starts at speed and direction of 0
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Steering at " + currentDirection + " degrees.");
    }

    public void move(int speed, int direction) {
        currentDirection = direction;
        currentSpeed = speed;
        System.out.println("Vehicle moves at " + currentSpeed + " in direction " + currentDirection + ".");
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentDirection = 0;
    }
}
