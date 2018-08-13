public class Vehicle {

    private int productionYear;
    private String model;
    private String color;
    private int doors;
    private int gear;

    public Vehicle(int productionYear, String model, String color, int doors, int gear) {
        this.productionYear = productionYear;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.gear = gear;
    }

    public void handSteering() {

    }

    public int changingGears(int gear) {
        return gear;
    }

    public int moving(int speed) {
        return speed;
    }


    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getGear() {
        return gear;
    }


}
