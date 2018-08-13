public class Sedan extends Car {

    private int trunk;


    public Sedan(int productionYear, String model, String color, int doors, int gear, int wheels, int trunk) {
        super(productionYear, model, color, doors, gear, wheels);
        this.trunk = trunk;
    }

    @Override
    public int moving(int speed) {
        if(speed > 90) {
            System.out.println("Driving at " + speed + ". You are not allowed to exceed 90 km/h, because you have a big trunk!");
        } else if(speed > 50) {
            System.out.println("You are driving at speed of " + speed + ". You should decelerate if you are at build-up area.");
        } else {
            System.out.println("You are driving like a newbie. ");
        }
        return speed;
    }
}

