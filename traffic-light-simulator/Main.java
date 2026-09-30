import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Traffic Light Simulator ===========");
        System.out.println("Select Colour");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");
        System.out.println("======================");

        System.out.print("Select Colour: ");
        int selectColour = scanner.nextInt();
        scanner.nextLine();

        switch (selectColour){
            case 1:
                System.out.println("\u001B[31m●\u001B[0m STOP!");
                break;
            case 2:
                System.out.println("\u001B[33m●\u001B[0m CAUTION!");
                break;
            case 3:
                System.out.println("\u001B[32m●\u001B[0m GO!");
                break;
            default:
                System.out.println("Invalid Selection");
        }
        scanner.close();
    }
}
