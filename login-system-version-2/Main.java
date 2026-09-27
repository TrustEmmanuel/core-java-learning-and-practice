import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Simple Login System ==========");
        String username = "JavaLover2026";
        String password = "admin123";
        boolean  loggedIN = false;

        for (int i = 3; i > 0; i--) {
            System.out.print("Input Username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Input Password: ");
            String inputPassword = scanner.nextLine();

            // Logic
            if (inputUsername.equals(username) && inputPassword.equals(password)){
                System.out.println("Access granted");
                loggedIN = true;
            }
            else{
                System.out.println("Invalid Credentials, Try Again");
            }
        }
        if (!loggedIN){
            System.out.println("Account Locked! Please contact your bank.");
        }
    }

}
