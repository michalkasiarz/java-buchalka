public class MegabytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2048);
        printMegaBytesAndKiloBytes(12321312);
        printMegaBytesAndKiloBytes(-213);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
