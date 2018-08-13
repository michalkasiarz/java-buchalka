public class Computer {

    String brand;
    String model;
    String operationSystem;
    String mainboard;
    String diskDriveType;
    String graphicsCardModel;
    int cpu;
    int ram;
    int graphicsCardMemory;
    int diskDriveCapacity;
    int productionYear;
    int price;

    public Computer(String brand, String model, String operationSystem, String mainboard, String diskDriveType, String graphicsCardModel, int cpu, int ram, int graphicsCardMemory, int diskDriveCapacity, int productionYear, int price) {
        this.brand = brand;
        this.model = model;
        this.operationSystem = operationSystem;
        this.mainboard = mainboard;
        this.diskDriveType = diskDriveType;
        this.graphicsCardModel = graphicsCardModel;
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCardMemory = graphicsCardMemory;
        this.diskDriveCapacity = diskDriveCapacity;
        this.productionYear = productionYear;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getMainboard() {
        return mainboard;
    }

    public String getDiskDriveType() {
        return diskDriveType;
    }

    public String getGraphicsCardModel() {
        return graphicsCardModel;
    }

    public int getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getGraphicsCardMemory() {
        return graphicsCardMemory;
    }

    public int getDiskDriveCapacity() {
        return diskDriveCapacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getPrice() {
        return price;
    }

    public void printComputerInfo() {
        System.out.println("Brand: " + getBrand() + "\nModel: " + getModel() + "\nMainboard: " + getMainboard() + "\nOperation system: " + getOperationSystem() + "\nDisk drive: " + getDiskDriveType() + getDiskDriveCapacity() + "\nGraphics card: " + getGraphicsCardModel() + ", " + getGraphicsCardMemory() + "\nCPU: " + getCpu() + "\nRAM: " + getRam() + "\nProduction year: " + getProductionYear() + "\nPrice: " + getPrice());
    }
}
