public class Bathroom {
    private String bath;
    private String sink;
    private String washingMachine;
    private String basket;
    private String mirror;

    public Bathroom(String bath, String sink, String washingMachine, String basket, String mirror) {
        this.bath = bath;
        this.sink = sink;
        this.washingMachine = washingMachine;
        this.basket = basket;
        this.mirror = mirror;
    }

    public void takebath() {
        System.out.println("You've taken a bath.");
    }

    public void washHands() {
        System.out.println("You've washed your hands in the sink.");
    }

    public void doTheLaundry() {
        System.out.println("You've done the laundry.");
    }

    public String getBath() {
        return bath;
    }

    public String getSink() {
        return sink;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public String getBasket() {
        return basket;
    }

    public String getMirror() {
        return mirror;
    }
}
