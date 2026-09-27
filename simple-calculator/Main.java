import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            menu();
            int option = selectOption();
            int digit1 = getDigits();
            System.out.println("Digit 1: " + digit1);
            int digit2 = getDigits();
            System.out.println("Digit 2: " + digit2);
            if (option == 1){
                int addition = add(digit1,digit2);
                System.out.println("Addition Solution: " + addition);
            }
            else if (option == 2) {
                int subtraction =  subtract(digit1,digit2);
                System.out.println("Subtraction Solution: " + subtraction);
            }
            else if (option == 3) {
                int multiplication = multiply(digit1,digit2);
                System.out.println("Multiplication Solution: " + multiplication);
            }
            else if (option == 4) {
                int division = divide(digit1,digit2);
                System.out.println("Division Solution: " + division);
            }
            else if (option  == 5) {
                System.out.println("Exiting.....");
                break;
            }
            else{
                System.out.println("Invalid Selection");
                continue;
            }

        }
    }
    public static void menu(){
        System.out.println("========== Simple Calculator ==========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
    public static int getDigits(){
        System.out.print("Input Digit: ");
        int inputDigit = scanner.nextInt();
        scanner.nextLine();
        return inputDigit;
    }
    public static int selectOption(){
        System.out.println("========== Select Option ==========");
        System.out.print("Input Option: ");
        int inputOption = scanner.nextInt();
        if (inputOption == 1){
            System.out.println("Addition");

        }
        else if (inputOption == 2) {
            System.out.println("Subtraction");

        }
        else if (inputOption == 3){
            System.out.println("Multiplication");

        }
        else if (inputOption == 4) {
            System.out.println("Division");

        }
        else if (inputOption == 5) {
            System.out.println("Exiting.....");

        }
        else {
            System.out.println("Invalid Option");

        }
        return inputOption;
    }
    public static int add (int x, int y){
        return x + y;

    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int divide(int x, int y){
        if (y  == 0){
            System.out.println("Cannot Divide by 0");
            return 0;
        }
        return x/y;
    }
}
