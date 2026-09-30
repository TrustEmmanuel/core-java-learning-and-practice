import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //SIMPLE ATM
        //Enter Pin Details
        System.out.println("========== SIMPLE  ATM ==========");
        System.out.println("========== Welcome! ==========");
        System.out.print("Insert Pin: ");
        int insertPin = scanner.nextInt();
        if (insertPin == 3991){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Wrong Pin");
            return;
        }

        // Balance
        System.out.println("========== Account Balance ==========");
        double accountBalance = 5000;
        System.out.println("Account Balance: " + "$" + accountBalance);


        System.out.println("========== Select Action ==========");
        // Choose Action
        String[] selectAction = new String[3];
        selectAction [0] = "Check Balance";
        selectAction [1] = "Withdraw";
        selectAction [2] = "Deposit";


        System.out.println("(1) " + selectAction[0]);
        System.out.println("(2) " + selectAction[1]);
        System.out.println("(3) " + selectAction[2]);

        System.out.print("Select Choice: ");
        int selectChoice = scanner.nextInt();

        System.out.println("========== Action ==========");
        if (selectChoice == 1){
            System.out.println("Account Balance: " + "$" + accountBalance);
        }
        else if(selectChoice == 2){
            System.out.print("Withdraw Amount: ");
            double withdrawAmount = scanner.nextDouble();
            if (withdrawAmount > accountBalance){
                System.out.println("Insufficient Funds");
                return;
            }
            double amountWithdrawn = (accountBalance - withdrawAmount);
            System.out.println("Account Balance: " + "$" + amountWithdrawn);
        }
        else if (selectChoice == 3){
            System.out.print("Deposit Amount: ");
            double depositAmount = scanner.nextDouble();
            double amountDeposited = (accountBalance + depositAmount);
            System.out.println("Account Balance: " + "$" + amountDeposited);
        }
        else{
            System.out.println("Wrong Input");
            return;
        }
    }
}

