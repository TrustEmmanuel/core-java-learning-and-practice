import java.util.Scanner;

public class BasicBankingOperations {

    public static void main(String[] args) {

        // Basic Banking Operations

        Scanner scanner = new Scanner(System.in);

        // Introductory Message
        System.out.print("Input Username: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Hello," + inputUsername);

        // Starting Balance
        int startingBalance = 50000;
        System.out.println("Starting Balance: "  + "₦" + String.format("%,d",startingBalance));

        // Deposit
        System.out.print("How much do you want to deposit?: ");
        int depositAmount = scanner.nextInt();
        System.out.println("Deposit: " + "₦" +  String.format("%,d",depositAmount));
        scanner.nextLine();

        // Current Balance
        int currentBalance = startingBalance + depositAmount;
        System.out.println("Current Balance: " + "₦" + String.format("%,d",currentBalance));

        // Withdrawal
        System.out.print("How Much do you want to withdraw?: ");
        int withdrawalAmount = scanner.nextInt();
        System.out.println("Withdrawal: " + "₦" + String.format("%,d",withdrawalAmount));

        // Final Balance
        int finalBalance = (startingBalance + depositAmount) - withdrawalAmount;
        System.out.println("Final Balance: " + "₦" +  String.format("%,d",finalBalance));


        // Banking Logic
        if (withdrawalAmount > currentBalance){
            System.out.println("Insufficient Funds");
        }
        else{
            System.out.println("Sufficient Funds");
        }
        scanner.close();
    }
}
