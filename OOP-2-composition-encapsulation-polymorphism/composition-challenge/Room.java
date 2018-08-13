public class Room {
    private Bed bed;
    private String nightStand;
    private Lamp lamp;
    private String wardrobe;

    public Room(Bed bed, String nightStand, Lamp lamp, String wardrobe) {
        this.bed = bed;
        this.nightStand = nightStand;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
    }

    public void gotoSleep() {
        bed.goToBed();
    }

    public void readABook() {
        lamp.turnOnOfftheLamp(true);
        System.out.println("You've read a very interesting book.");
    }

    public Bed getBed() {
        return bed;
    }

    public String getNightStand() {
        return nightStand;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public String getWardrobe() {
        return wardrobe;
    }
}
