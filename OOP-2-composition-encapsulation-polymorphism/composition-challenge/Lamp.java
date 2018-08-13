public class Lamp {

    private String bulb;
    private boolean turned = false;

    public void turnOnOfftheLamp(boolean turned) {
        this.turned = turned;
        if (turned) {
            System.out.println("You've turned the lamp ON.");
        } else {
            System.out.println("You've turned the lamp OFF.");
        }
    }
}
