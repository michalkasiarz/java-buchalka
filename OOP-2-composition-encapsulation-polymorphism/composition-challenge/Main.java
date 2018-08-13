public class Main {

    public static void main(String[] args) {
        Bed theBed = new Bed("in the corner");
        Lamp theLamp = new Lamp();
        Room myRoom = new Room(theBed, "LittleReader", theLamp, "IKEA wardrobe");
        Kitchen myKitchen = new Kitchen("Mastercook", "Beko", "IKEA table", "Zelmer", "Oval sink", "Indesit Dishwasher XC200");
        Bathroom myBathroom = new Bathroom("BigBath", "Square-sink", "Łucznik 7KG", "Auchan basket", "Your Shadow RX350");
        House myHouse = new House(myRoom, myKitchen, myBathroom, "The Best Address");

        myHouse.enterTheHouse();
        myHouse.gotoTheRoom();
        myRoom.readABook();
        myHouse.goToTheBathroom();
        myHouse.getBathroom().doTheLaundry();
        myHouse.getRoom().getLamp().turnOnOfftheLamp(false);
        myHouse.getRoom().gotoSleep();
    }
}
