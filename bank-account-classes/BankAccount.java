import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);

    String accountName;
    int accountNumber;
    double balance;
    boolean isActive;

    void deposit(){
        System.out.print("Input Deposit Amount: ");
        double depositAmount = scanner.nextDouble();

            if (depositAmount > 0){
                balance = balance + depositAmount;
                System.out.println("Account Balance: " + balance);
            }
            else{
                System.out.println("Please Retry");
            }

    }
    void  withdrawal(){
        System.out.print("Input Withdrawal Amount: ");
        double withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount > balance){
                System.out.println("Insufficient Funds");
                return;
            }
            else {
                balance = balance - withdrawalAmount;
                System.out.println("Account Balance: " + balance);
            }
    }
    void checkBalance(){
        System.out.println("Account Balance: " + balance);
    }

}
