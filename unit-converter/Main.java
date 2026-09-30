import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== Unit Converter ==========");
        System.out.println("Select the Unit to convert");

        System.out.println("1. KM → Miles");
        System.out.println("2. Celsius → Fahrenheit");
        System.out.println("3. Pounds → Kilograms");
        System.out.println("====================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the Unit: ");
        int selectUnit = scanner.nextInt();
        scanner.nextLine();

        if (selectUnit >= 4){
            System.out.println("Invalid Selection");
            return;
        }

        // Switch Logic & Selection
        switch (selectUnit){
            case 1:
                System.out.println("KM → Miles");
                    System.out.print("Input Digit: ");
                        double kmMiles = scanner.nextDouble();
                        scanner.nextLine();
                            System.out.println("Result: " + kmMiles * 0.621371 + "Miles");
                            break;
            case 2:
                System.out.println("Celsius → Fahrenheit");
                    System.out.print("Input Digit: ");
                        double celsiusFahrenheit = scanner.nextDouble();
                        scanner.nextLine();
                             System.out.println("Result: " + ((celsiusFahrenheit * 1.8)+32) + "°F");
                             break;
            case 3:
                System.out.println("Pounds → Kilograms");
                    System.out.print("Input Digit: ");
                        double poundsKilograms = scanner.nextDouble();
                        scanner.nextLine();
                            System.out.println("Result: " + poundsKilograms * 0.453592 + "kg");
                            break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
        scanner.close();
    }
}
