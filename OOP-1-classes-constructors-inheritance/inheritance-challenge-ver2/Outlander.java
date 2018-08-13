
public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int roadService) {
        super("Outlander", 4, 5, 6, false);
        this.roadServiceMonths = roadService;
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 30) {
            changeGear(2);
        } else if (newSpeed > 30 && newSpeed <= 40) {
            changeGear(3);
        } else if (newSpeed > 40 && newSpeed <= 50) {
            changeGear(3);
        } else if (newSpeed > 50 && newSpeed <= 70) {
            changeGear(5);
        } else if (newSpeed > 70) {
            changeGear(6);
        }

        if(newSpeed > 0) {
            changeVelocity(newSpeed, getCurrentDirection());
        }


    }
}
