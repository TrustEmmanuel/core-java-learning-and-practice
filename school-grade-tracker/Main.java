import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== High-School Grade Book & Performance Tracker ==========");
        Scanner scanner = new Scanner(System.in);
        int correctPin = 9900;
        boolean loggedIn = false;
        ArrayList<String> studentNamesStore = new ArrayList<>();
        ArrayList<Double> studentScoreStore = new ArrayList<>();


        System.out.println("++++++++++ Login System +++++++++++");
        System.out.print("Input Username: ");
        String inputUsername = scanner.nextLine();
        // Login Logic
        for (int i = 3; i >= 0; i--) {

            System.out.print("Input Pin: ");
            int inputPin = scanner.nextInt();
            scanner.nextLine();
            if (inputPin == correctPin){
                loggedIn = true;
                System.out.println("Access Granted!");
                System.out.println("++++++++++++++++++++++++");
                break;
            }
            else {
                System.out.println("Invalid Credentials, try again...");
            }
            if (i == 0){
                System.out.println("Account Locked, Contact Admin");
            }
        }
        if (loggedIn){
            System.out.print("How many Students for you want to store: ");
            int noStudentsToStore = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < noStudentsToStore; j++) {
                System.out.print("Input Student Name Number " + ( j+1 ) + " :");
                String studentNames = scanner.nextLine();
                studentNamesStore.add(studentNames);
            }
            System.out.println("++++++++++++++++++++++++");

            for (String x: studentNamesStore){
                System.out.println("Names: " + x);
            }
            System.out.println("++++++++++++++++++++++++");

            //Student Score
            double sum = 0;
            double average = 0;
            for (int i = 0; i < studentNamesStore.size(); i++) {
                System.out.print("Input Score of:" + studentNamesStore.get(i) + " : ");
                double inputScore = scanner.nextDouble();
                scanner.nextLine();
                studentScoreStore.add(inputScore);
                sum += studentScoreStore.get(i);
                average = sum / noStudentsToStore;
                if (studentScoreStore.get(i) >= 90){
                    System.out.println("Student: " + studentNamesStore.get(i) + " Got an A ");
                }
                else if (studentScoreStore.get(i) >= 70) {
                    System.out.println("Student: " + studentNamesStore.get(i) + " Got a B ");
                }
                else if (studentScoreStore.get(i) >= 60) {
                    System.out.println("Student: " + studentNamesStore.get(i) + " Got a C ");
                }
                else if (studentScoreStore.get(i) >= 50) {
                    System.out.println("Student: " + studentNamesStore.get(i) + " Got a D ");
                }
                else if (studentScoreStore.get(i) >= 45) {
                    System.out.println("Student: " + studentNamesStore.get(i) + " Got an F ");
                }
                else {
                    System.out.println("Student: " + studentNamesStore.get(i) + " Got an F ");
                }
            }
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Student Scores: " + studentScoreStore);
            System.out.println("Total Score: " + sum);
            System.out.println("Average: " + average);
            double getMax = Collections.max(studentScoreStore);
            double getMin = Collections.min(studentScoreStore);
            System.out.println("Highest Score: " + getMax);
            System.out.println("Lowest Score: " + getMin);
            System.out.println("++++++++++++++++++++++++");


        }






    } //  end of main
}