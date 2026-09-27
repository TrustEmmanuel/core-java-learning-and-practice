import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== Number Guessing Game ==========");
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 55;
        int retry = 3;

        do {
            System.out.print("Guess Number: ");
            int guessNumber = scanner.nextInt();
            scanner.nextLine();
            if (guessNumber != secretNumber){
                System.out.println("Try again");
                retry--;
            }
            else{
                System.out.println("Correct!");
                break;
            }
        }while (retry > 0);

    }
}
