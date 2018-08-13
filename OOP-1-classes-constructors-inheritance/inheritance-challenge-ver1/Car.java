public class Car extends Vehicle {

    private int wheels;

    public Car(int productionYear, String model, String color, int doors, int gear, int wheels) {
        super(productionYear, model, color, doors, gear);
        this.wheels = wheels;
    }

    @Override
    public int moving(int speed) {
        if(speed > 150) {
            System.out.println("Driving at " + speed + " is very dangerous and prohibited in Poland. Please, decelerate your car!");
        } else if(speed > 90){
            System.out.println("At your current speed of " + speed + " you can drive only at highways.");
        } else if(speed > 50) {
            System.out.println("You are driving at speed of " + speed + ". You should decelerate if you are at build-up area.");
        } else {
            System.out.println("You are driving like a newbie. ");
        }
        return speed;
    }

    @Override
    public int changingGears(int gear) {
        if(gear > getGear()) {
            System.out.println("Gear changed to higher: " + gear);
            return gear;
        } else if(gear < getGear()) {
            System.out.println("Gear changed to lower: " + gear);
            return gear;
        } else {
            System.out.println("Gear remains at " + gear);
        }
        return gear;
    }
}


