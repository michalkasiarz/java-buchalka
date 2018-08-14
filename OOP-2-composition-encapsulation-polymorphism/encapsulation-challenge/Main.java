public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer(50, true);
        System.out.println("Initial page count is " + myPrinter.getNumberOfPrintedPages());
        int pagesPrinted = myPrinter.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + myPrinter.getNumberOfPrintedPages() + ".");
        pagesPrinted = myPrinter.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + myPrinter.getNumberOfPrintedPages() + ".");

        System.out.println("\nPrinter without duplex: \n");

        Printer mySecondPrinter = new Printer(50, false);
        System.out.println("Initial page count is " + mySecondPrinter.getNumberOfPrintedPages());
        pagesPrinted = mySecondPrinter.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + mySecondPrinter.getNumberOfPrintedPages() + ".");
        pagesPrinted = mySecondPrinter.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + mySecondPrinter.getNumberOfPrintedPages() + ".");


    }
}
