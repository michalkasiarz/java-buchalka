import java.util.ArrayList;

public class ToDoList {

    // ArrayList can hold objects
    // and handles the size of itself automatically
    private ArrayList<String> toDoList = new ArrayList<String>();


    // adding an element to the ArrayList
    public void addTask(String task) {
        toDoList.add(task);
    }

    // printing all elements from the ArrayList
    public void printTasks() {
        System.out.println("You have " + toDoList.size() + " tasks to do.");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
    }

    // modifies the element in the ArrayList (by replacing it)
    public void modifyTask(int position, String newTask) {
        toDoList.set(position, newTask);
        System.out.println("Task " + (position + 1) + " has been modified.");
    }

    // removing a specfic task (with specific index)
    public void removeTask(int position) {
        String specificTask = toDoList.get(position);
        toDoList.remove(position-1);
        System.out.println("Task " + (position) + " has been removed.");
    }

    // finding a fask with specified name
    public String findTask(String task) {
        int position = toDoList.indexOf(task);
        if (position >= 0) {
            return toDoList.get(position);
        }
        return null;
    }
}
