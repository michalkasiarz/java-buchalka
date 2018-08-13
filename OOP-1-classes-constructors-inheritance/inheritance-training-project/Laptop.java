public class Laptop extends Computer {

    private int weight;
    private String matrixType;
    private boolean multiTouchMatrix;
    private int batteryCapacity;

    public Laptop(String brand, String model, String operationSystem, String mainboard, String diskDriveType, String graphicsCardModel, int cpu, int ram, int graphicsCardMemory, int diskDriveCapacity, int productionYear, int price, int weight, String matrixType, boolean multiTouchMatrix, int batteryCapacity) {
        super(brand, model, operationSystem, mainboard, diskDriveType, graphicsCardModel, cpu, ram, graphicsCardMemory, diskDriveCapacity, productionYear, price);
        this.weight = weight;
        this.matrixType = matrixType;
        this.multiTouchMatrix = multiTouchMatrix;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void printComputerInfo() {
        super.printComputerInfo();
        System.out.println("Weight: " + weight + "\nMatrix type: " + matrixType + "\nMulti-touch matrix: " + multiTouchMatrix + "\nBattery capacity: " + batteryCapacity);
    }
}
