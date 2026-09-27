

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  ---------- Exercise 28 ----------     ");
        System.out.println("+++++ Interactive Grocery List +++++");
        ArrayList<String> groceryList = new ArrayList<>();
        boolean inputtingList = true;

/*
    Below is the logic for the Grocery System Selection, this allows users to add items
    as well as clearing the items and printing out the grocery list
 */
        while (inputtingList){
            System.out.print("Input Grocery Item: ");
            String inputItem = scanner.nextLine();
            if (inputItem.equalsIgnoreCase("STOP")){
                System.out.println("List exited");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("      GROCERY LIST         ");
                System.out.println("++++++++++++++++++++++++++++");
                for (int i = 0; i < groceryList.size(); i++) {
                    System.out.println("Item No. " + (i+1) + " :" + groceryList.get(i)); // Print List
                }
                inputtingList = false;
                break;
            }
            if (inputItem.equalsIgnoreCase("CLEAR")){
                groceryList.clear(); // Clear List
                System.out.println("You cleared your grocery list");
            }
            else{
                groceryList.add(inputItem); // Store List
            }
        }
        scanner.close();
    }
}
