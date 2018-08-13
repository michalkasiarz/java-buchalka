public class Case {
    private String model;
    private String manufacturer;
    private String powersSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powersSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersSupply = powersSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersSupply() {
        return powersSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
