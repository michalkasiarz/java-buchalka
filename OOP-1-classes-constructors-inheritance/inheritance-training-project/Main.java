public class Main {

    public static void main(String[] args) {

        Computer comp1 = new Computer("Dell", "XPS22", "Windows 10", "Intel", "SSD", "GeForce 1060", 3600, 2000, 4000, 128, 2009, 1150);
        Laptop laptop1 = new Laptop("Dell", "Precision", "Ubuntu", "Special20", "SSD", "NVIDA 900", 4500, 2322, 5000, 256, 2013, 2300, 8, "mat", true, 3200);

        comp1.printComputerInfo();

        System.out.println("===========================");

        laptop1.printComputerInfo();
    }
}
