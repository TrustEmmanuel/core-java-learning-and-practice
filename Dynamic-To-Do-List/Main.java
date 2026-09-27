
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- Dynamic To-Do List ----------");
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = true;
        ArrayList<String> tasks = new ArrayList<>();






        do {
            System.out.println("+++++ Welcome to the Dynamic To-Do List Application +++++");
            System.out.println("(1) Add a New Task");
            System.out.println("(2) View Tasks");
            System.out.println("(3) Mark Tasks");
            System.out.println("(4) Exit Application");
            System.out.println("____________________________");
            System.out.print("Select Option: ");
            int selectOption = scanner.nextInt();
            scanner.nextLine();
            switch (selectOption){
                case 1:
                        /*
                        This Module is used for adding new Task
                         */
                    System.out.println("+++++ Add New Task +++++");
                    while (true){
                        System.out.print("Input Task(Input Stop to end addition): ");
                        String inputTask = scanner.nextLine();
                        if (inputTask.equalsIgnoreCase("Stop")){
                            System.out.println("List Addition Stopped");
                            break;
                        }
                        else{
                            tasks.add(inputTask);

                        }
                    }
                    break;
                case 2:
                        /*
                        This module is to view the tasks added
                         */
                    System.out.println("+++++ View Tasks +++++");
                    if (tasks.isEmpty()){
                        System.out.println("Task List Empty");
                    }
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println("Task " + (i+1) + " - " + tasks.get(i));
                    }
                    break;
                case 3:
                        /*
                        This module is to mark tasks done, It uses the
                         */
                    System.out.println("+++++ Mark Tasks +++++");
                    if (tasks.isEmpty()){
                        System.out.println("Task List empty");
                        break;
                    }
                    for (int j = 0; j < tasks.size(); j++) {
                        System.out.println("Task " + (j+1) + " - " + tasks.get(j));

                    }
                    System.out.print("Select Task to mark: ");
                    int selectTask = scanner.nextInt();
                    if (selectTask == 1){
                        selectTask = 0;
                    }
                    tasks.remove(selectTask);
                    System.out.println("Task Done");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }while (loggedIn);
        scanner.close();
    }
}
