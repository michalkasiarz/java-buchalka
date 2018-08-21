public class Main {

    private static VisitedPlaces visitedPlaces = new VisitedPlaces();

    public static void main(String[] args) {


        visitedPlaces.addPlace("Grecja");
        visitedPlaces.addPlace("Węgry");
        visitedPlaces.addPlace("Ukraina");
        visitedPlaces.addPlace("Austria");
        visitedPlaces.addPlace("Białoruś");
        visitedPlaces.addPlace("Niemcy");
        visitedPlaces.printPlaces();
        visitedPlaces.modifyPlace(2, "Czechy");
        visitedPlaces.printPlaces();
        visitedPlaces.queryElement("Ukraina");
        visitedPlaces.queryElement("Czarnogóra");
        visitedPlaces.removePlace("Białoruś");
        visitedPlaces.removePlace("Niemcy");
        visitedPlaces.printPlaces();


    }
}
