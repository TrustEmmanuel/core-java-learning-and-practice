import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Multiplication Table==========");

        System.out.print("Input Digit: ");
        int inputDigit = scanner.nextInt();
        scanner.nextLine();


        for (int i = 1; i <= 12; i++) {
            int solution = inputDigit * i;
            System.out.println(inputDigit + "x" + i + "=" + solution);

        }

    }
}
