public class Bed {

    private String location;

    public Bed(String location) {
        this.location = location;
    }

    public void goToBed() {
        System.out.println("You went to bed.");
    }

    public String getLocation() {
        return location;
    }
}
