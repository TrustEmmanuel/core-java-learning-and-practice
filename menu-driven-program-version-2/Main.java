import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Menu Driven Program ==========");
        System.out.println("1. Multiplication Table");
        System.out.println("2. Even/Odd Counter");
        System.out.println("3. Score Analyzer");
        System.out.println("4. Guessing Game");
        System.out.println("5. Exit");
        System.out.println("==================");

        System.out.print("Select Option: ");
        int selectOption = scanner.nextInt();
        scanner.nextLine();

        // Options
        switch (selectOption){
            case 1:
                System.out.println("========== 1. Multiplication Table ==========");
                System.out.print("Input First Number: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Input Second Number: ");
                int secondNumber = scanner.nextInt();
                for (int i = 1; i <= secondNumber; i++) {
                    System.out.println(firstNumber + " x " + i + " = " + (firstNumber*i));
                }
                break;
            case 2:
                System.out.println("========== 2. Even/Odd Counter ==========");
                System.out.print("Input Number: ");
                int counterNumber = scanner.nextInt();
                for (int i = 0; i < counterNumber; i++) {
                    if (i % 2 !=0){
                        System.out.println("Odd Number: " + i);
                    }
                    else{
                        System.out.println("Even Number: " + i);
                        System.out.println();
                    }
                }
                break;
            case 3:
                System.out.println("========== 3. Score Analyzer ==========");
                int[] score = {12 , 15, 60};
                int highest = score[0];
                int lowest = score[0];

                for (int i = 0; i < score.length; i++) {
                    if (score[i] > highest){
                        highest = score[i];
                    }
                }
                System.out.println("Highest: " + highest);
                for (int i = 0; i < score.length; i++) {
                    if (score[i] < lowest){
                        lowest = score[i];

                    }
                }
                System.out.println("Lowest: " + lowest);
                break;

            case 4:
                System.out.println("========== 4. Guessing Game =========");
                int correctNumber = 68;

                for (int i = 3; i > 0; i--) {
                    System.out.print("Select a Number: ");
                    int guessChoice = scanner.nextInt();
                    if (guessChoice < 67){
                        System.out.println("Go Higher!");
                    }
                    else if (guessChoice > 67) {
                        System.out.println("Go Lower");
                    }
                    else{
                        System.out.println("This is Correct!");
                    }
                    if (i < 2){
                        System.out.println("Game Over!");

                    }
                }
                break;
            case 5:
                System.out.println("5. Exit");
                System.out.println("Thank you for playing!");
                break;
        }
    }

}



