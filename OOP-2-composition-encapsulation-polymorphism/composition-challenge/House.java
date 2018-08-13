public class House {
    private Room room;
    private Kitchen kitchen;
    private Bathroom bathroom;
    private String address;

    public House(Room room, Kitchen kitchen, Bathroom bathroom, String address) {
        this.room = room;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.address = address;
    }

    public void enterTheHouse() {
        System.out.println("You've entered the house.");
    }

    public void gotoTheRoom() {
        System.out.println("You've entered your lovely room.");
    }

    public void goToTheBathroom() {
        System.out.println("You've entered your lovely bathroom.");
    }


    public Room getRoom() {
        return room;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public String getAddress() {
        return address;
    }
}
