

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("++++++++++ Student Grade Book & Analytics Manager ++++++++++");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> storeScores = new ArrayList<>();
        boolean withinApplication = true;
        double sumTotal = 0.0;
        double average = 0.0;





        do {
            System.out.println("---------- Menu ----------");
            System.out.println("(1) Add Student Grades");
            System.out.println("(2) View Recorded Grades");
            System.out.println("(3) Calculate Class Statistics");
            System.out.println("(4) Exit");
            System.out.println("------------------------------");
            System.out.print("Select Option: ");
            int selectOption = scanner.nextInt();
            scanner.nextLine();
            switch (selectOption){
                case 1:
                    boolean addingGrades = true;
                    System.out.println("+++++ Add Student Grades +++++");
                    while (addingGrades){
                        System.out.print("Input Student Grade(Or Type \"Stop\" to stop adding scores): ");
                        String inputStudentGrade = scanner.nextLine();
                        if (inputStudentGrade.equalsIgnoreCase("Stop")){
                            System.out.println("Addition Stopped");
                            addingGrades = false;
                            break;
                        }
                        else{
                            double getGrade = Double.parseDouble(inputStudentGrade);
                            storeScores.add(getGrade);
                            System.out.println("Grade Added");
                        }
                    }
                    break;
                case 2:
                    System.out.println("+++++ View Recorded Grades +++++");
                    for (int i = 0; i < storeScores.size(); i++) {
                        System.out.println("Student Number " + (i+1) + " - " + storeScores.get(i));

                    }
                    break;
                case 3:
                    System.out.println("+++++ Calculate Statistics +++++");
                    Double minimumScore = Collections.min(storeScores);
                    Double maximumScore = Collections.max(storeScores);

                    for (int j = 0; j < storeScores.size(); j++) {
                        sumTotal = sumTotal + storeScores.get(j);
                        average = sumTotal / storeScores.size();
                    }
                    System.out.println("Minimum Score - " + minimumScore);
                    System.out.println("Maximum Score - " + maximumScore);

                    System.out.printf("Average Score - %.1f " , average);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting..");
                    withinApplication = false;
                    break;
                default:
                    System.out.println("Invalid Selection, Please select a valid option from the menu");
                    break;
            }
        }while (withinApplication);
        scanner.close();
    }
}
