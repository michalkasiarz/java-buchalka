public class Main {

    public static void main(String[] args) {

        Sedan mySedan = new Sedan(2012, "Croma", "Black", 4, 1, 4, 250);
        Car myCar = new Car(2018, "Linea", "White", 4, 1, 4);

        System.out.println(mySedan.getModel());
        mySedan.changingGears(1);
        mySedan.moving(30);
        mySedan.changingGears(3);
        mySedan.moving(60);
        mySedan.changingGears(5);
        mySedan.moving(95);
        mySedan.changingGears(6);
        mySedan.moving(160);
        mySedan.changingGears(4);
        mySedan.moving(70);

        System.out.println();

        System.out.println(myCar.getModel());
        myCar.changingGears(1);
        myCar.moving(30);
        myCar.changingGears(2);
        myCar.moving(45);
        myCar.changingGears(4);
        myCar.moving(80);
        myCar.changingGears(2);
        myCar.moving(25);
        myCar.changingGears(5);
        myCar.moving(105);




    }
}
