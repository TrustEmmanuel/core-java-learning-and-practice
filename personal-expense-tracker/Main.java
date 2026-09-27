

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------- Project 9 ---------------");
        System.out.println("+++ Personal Daily Expense Log & Budget Tracker +++");

        double[] expenses = new double[7];
        expenses[0] = 0.00;
        expenses[1] = 0.00;
        expenses[2] = 0.00;
        expenses[3] = 0.00;
        expenses[4] = 0.00;
        expenses[5] = 0.00;
        expenses[6] = 0.00;

        double sum = 0.00;
        double max = 0.00;
        boolean check = true;


        do {
            System.out.println("Welcome to your Daily Tracker!");
            System.out.println("-----------------------------");
            System.out.println("View Options");
            System.out.println("-----------------------------");
            System.out.println("(1) View Weekly Spending");
            System.out.println("(2) Input/Update Expenses");
            System.out.println("(3) Calculate Total Spending");
            System.out.println("(4) Highest Daily Expense");
            System.out.println("(5) Exit");
            System.out.println("-----------------------------");
            System.out.print("Select Option: ");
            int inputOption = scanner.nextInt();
            scanner.nextLine();

            switch (inputOption){
                case 1:
                    System.out.println("+++++ View Weekly Spending +++++");
                    for (int i = 0; i < expenses.length; i++) {
                        System.out.println("Day " + (i+1) + " =  " + expenses[i]);

                    }
                    break;
                case 2:
                    System.out.println("+++++ Input/Update Expenses +++++");
                    System.out.print("Select Day to Input Expense: ");
                    int selectDay = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Select Amount to Input: ");
                    double inputAmount = scanner.nextDouble();
                    scanner.nextLine();

                    expenses[selectDay - 1] = inputAmount;
                    System.out.println(Arrays.toString(expenses));
                    break;
                case 3:
                    System.out.println("+++++ Calculate Total Spending +++++");
                    for (int i = 0; i < expenses.length; i++) {
                        sum = sum + expenses[i];
                    }
                    System.out.println("Total Weekly Spending: $" + sum);

                    break;
                case 4:
                    System.out.println("+++++ Highest Daily Expense +++++");
                    for (int i = 0; i < expenses.length; i++) {
                        if (expenses[i] > max){
                            max = expenses[i];
                        }
                    }
                    System.out.println("Highest Daily Expense: " + max);
                    break;

                case 5:
                    System.out.println("Exiting.....");
                    check= false;
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }while (check);

        scanner.close();
    }
}
