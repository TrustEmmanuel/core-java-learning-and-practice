import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== Menu Driven Program ==========");
        Scanner scanner = new Scanner(System.in);
        int accountBalance = 5000;



        while (true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Select Input: ");
            int selectInput = scanner.nextInt();
            scanner.nextLine();

            switch (selectInput){
                case 1:
                    System.out.println("Account Balance: " + accountBalance);
                    break;
                case 2:
                    System.out.println("2. Deposit");
                    System.out.print("Input Deposit Amount: ");
                    int depositAmount = scanner.nextInt();
                    accountBalance = accountBalance += depositAmount;
                    System.out.println("Account Balance:" + accountBalance);
                    break;
                case 3:
                    System.out.println("3. Withdraw");
                    System.out.print("Input Withdrawal Amount: ");
                    int withdrawalAmount = scanner.nextInt();
                    if (withdrawalAmount > accountBalance){
                        System.out.println("Insufficient Funds!");
                        break;
                    }
                    else{
                        accountBalance = accountBalance - withdrawalAmount;
                        System.out.println("Account Balance: " + accountBalance);
                        break;
                    }
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid Choice");

            }

        }

    }
}

