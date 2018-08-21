import java.util.ArrayList;

public class VisitedPlaces {

    private ArrayList<String> visitedPlaces = new ArrayList<String>();

    // adding an element
    public void addPlace(String place) {
        visitedPlaces.add(place);
        System.out.println(place + " has been added to your list of visited places.");
    }

    // removing an element
    public void removePlace(String place) {
        visitedPlaces.remove(place);
        System.out.println(place + " has been removed from your list of visited places.");
    }

    // modifying an element
    public void modifyPlace(int position, String place) {
        visitedPlaces.set(position-1, place);
        System.out.println("Entry no. " + (position) + " has been modified.");
    }

    // querying an element
    public void queryElement(String place) {
        if (visitedPlaces.contains(place)) {
            System.out.println(place + " found on your list of visited places.");
        } else {
            System.out.println(place + " was not found on your list of visited places.");
        }
    }

    // printing all elements
    public void printPlaces() {
        for(int i=0; i<visitedPlaces.size(); i++) {
            System.out.println((i+1) + ". " + visitedPlaces.get(i));
        }
    }
}
