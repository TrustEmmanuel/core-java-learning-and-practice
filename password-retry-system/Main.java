import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Password Retry System =====");
        Scanner scanner  = new Scanner(System.in);

        String presetPassword = "admin123";

        while (true){
            System.out.print("Input Password: ");
            String inputPassword = scanner.nextLine();
            if (!inputPassword.equalsIgnoreCase(presetPassword)){
                System.out.println("Wrong password");
            }
            else{
                System.out.println("Access granted");
                break;
            }
        }
    }

}