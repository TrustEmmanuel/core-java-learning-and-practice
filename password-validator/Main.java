import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== Password Validator ==========");
        System.out.println("**********************");
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Input Username: ");
        String inputName = scanner.nextLine();

        System.out.print("Input Password: ");
        String inputPassword = scanner.nextLine();

        String correctPassword = "GODanswers123";

        while (!inputPassword.equalsIgnoreCase(correctPassword)){
            System.out.println("Invalid Password, Try Again");
            System.out.print("Input Password: ");
            inputPassword = scanner.nextLine();

        }
        System.out.println("Password Valid!");
        scanner.close();
    }

}
