import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====Number Guessing Game=====");

        Scanner scanner = new Scanner(System.in);

        int secret = 55;
        int guess = 0;

        while (guess != secret){
            System.out.print("Guess The Number: " );
            guess = scanner.nextInt();

            if (guess > secret){
                System.out.println("Go Lower!");
            }
            else if (guess < secret) {
                System.out.println("Go Higher!");
            }
            else{
                System.out.println("\uD83C\uDF89 Correct! You guessed the number!");
            }

        }
        scanner.close();
    }
}
