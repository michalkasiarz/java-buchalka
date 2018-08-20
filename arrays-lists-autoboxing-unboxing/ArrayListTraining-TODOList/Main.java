import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList myToDoList = new ToDoList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myToDoList.printTasks();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    modifyTask();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    searchForTask();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 to print the choice options");
        System.out.println("\t 1 to print the TODO list");
        System.out.println("\t 2 to add a task to the list");
        System.out.println("\t 3 to modify a task in the list");
        System.out.println("\t 4 to remove a task from the list");
        System.out.println("\t 5 to search for a task in the list");
        System.out.println("\t 6 to quit the application");
    }


    public static void addTask() {
        System.out.print("Please enter the task:");
        myToDoList.addTask(scanner.nextLine());
    }

    public static void modifyTask() {
        System.out.print("Enter task number: ");
        int taskNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement task: ");
        String newTask = scanner.nextLine();
        myToDoList.modifyTask(taskNo - 1, newTask);
    }

    public static void removeTask() {
        System.out.print("Enter task number: ");
        int taskNo = scanner.nextInt();
        scanner.nextLine();
        myToDoList.removeTask(taskNo);
    }

    public static void searchForTask() {
        System.out.println("Task to search for:");
        String searchTask = scanner.nextLine();
        if (myToDoList.findTask(searchTask) != null) {
            System.out.println("Found " + searchTask + " in your TODO list");
        } else {
            System.out.println(searchTask + " not found in your TODO list");
        }
    }
}
