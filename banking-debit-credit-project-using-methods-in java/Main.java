import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int myPin = 9900;
    static String myUsername = "JavaLover1993";
    static boolean loggedIn = false;
    static double accountBalance = 0.00;

    public static void main(String[] args) { // Beginning of Main
        header();

        for (int i = 2; i  >= 0; i--) { // Beginning of Accessing the System

            String printUsername = getUsername();
            int printPin = getPin();

            if (printUsername.equals(myUsername) && printPin == myPin){
                System.out.println("Access Granted");
                loggedIn = true;
                break;
            }else{
                System.out.println("Invalid Credentials");
                continue;
            }
        } // End of Accessing the System
        if (!loggedIn){
            System.out.println("Account Locked, Contact Bank...");
            return;
        }
        // Logic
        else if (loggedIn) {

        }
        while (true){
            bankMenu();
            int selectedMenuOption = selectChoice();
            switch (selectedMenuOption){
                case 1:
                    double printBalance = viewBalance();
                    System.out.println("Account Balance: " + printBalance);
                    break;
                case 2:
                    accountBalance = addFunds();
                    break;
                case 3:
                    accountBalance = withdrawFunds();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }// End of Main
    public static void header(){
        System.out.println("========== John Udeka Memorial Bank ==========");
    }
    public static String getUsername(){
        System.out.print("Input Username: ");
        String inputUsername = scanner.nextLine();
        return inputUsername;
    }
    public static int getPin(){
        System.out.print("Input Pin: ");
        int inputPin = scanner.nextInt();
        scanner.nextLine();
        return inputPin;
    }
    public static void bankMenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
    }
    public static int selectChoice(){
        System.out.print("Select Option: ");
        int selectOption = scanner.nextInt();
        scanner.nextLine();
        return selectOption;
    }
    public static double addFunds(){
        System.out.print("Input Deposit Amount: ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        depositAmount = depositAmount + accountBalance;
        System.out.println("Deposit Amount: " + depositAmount);
        return depositAmount;
    }
    public static double viewBalance(){
        return accountBalance;
    }
    public static double withdrawFunds(){
        System.out.print("Input Withdrawal Amount: ");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        if (withdrawAmount > accountBalance){
            System.out.println("Insufficient Funds");
            return accountBalance;
        }else{
            double updatedBalance = accountBalance - withdrawAmount;
            System.out.println("Balance after Withdrawal: " + withdrawAmount);
            return updatedBalance;
        }
    }

}
