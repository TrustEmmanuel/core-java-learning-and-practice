import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- ATM BANKING SIMULATOR ----------");

        int accountBalance = 5000;
        int atmPin = 1010;
        char symbol = '$';
        boolean loggedIn = true;
        boolean locked = false;

        System.out.println("+++++ Welcome to Capital Bank +++++");

        for (int i = 3; i > 0; i--) {
            System.out.print("Input Pin: ");
            int inputPin = scanner.nextInt();
            scanner.nextLine();
            if (inputPin == atmPin){
                System.out.println("Access Granted!");
                break;
            }
            else {
                System.out.println("Invalid Pin, please retry");
            }
            if (i == 1){
                System.out.println("Account Locked");
                locked = true;
                return;
            }
        }


        do {
            System.out.println("+++++ Banking Services +++++");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit ");

            System.out.print("Please select Option: ");
            int selectOption = scanner.nextInt();

            switch (selectOption){
                case 1:
                    System.out.println("+++++ Account Balance +++++");
                    System.out.println("Account Balance: " + symbol + accountBalance);
                    break;
                case 2:
                    System.out.println("+++++ Deposit Money +++++");
                    System.out.print("Input Deposit Amount: ");
                    int depositMoney = scanner.nextInt();
                    scanner.nextLine();

                    accountBalance = depositMoney + accountBalance;
                    System.out.println("Amount deposited successfully");
                    System.out.println("---------------------------");
                    System.out.println("Balance: " + symbol + accountBalance);
                    break;

                case 3:
                    while (true){
                        System.out.print("Input Amount to withdraw: ");
                        int withdrawMoney = scanner.nextInt();
                        scanner.nextLine();
                        if (withdrawMoney > accountBalance){
                            System.out.println("Invalid Amount, Insufficient Balance");
                        }
                        else{
                            accountBalance = accountBalance - withdrawMoney;
                            System.out.println("Amount withdrawn successfully");
                            System.out.println("---------------------------");
                            System.out.println("Balance: " + symbol + accountBalance);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting......");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while (loggedIn);

    }
}
