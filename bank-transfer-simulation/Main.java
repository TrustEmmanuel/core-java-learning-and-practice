import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double accountA = 10000;
        double accountB = 5000;

        System.out.println("========== Banking Transfer Simulation ==========");


        // Banking Logic
        while (true){
            System.out.print("Input Amount: ");
            double inputAmount = scanner.nextDouble();
            if (inputAmount > accountA){
                System.out.println("Insufficient Funds!");
                scanner.nextLine();
                break;
            }
            else{
                accountA -= inputAmount;
                accountB += inputAmount;
                System.out.println("Transfer Successful! " + accountB);
            }

        }
    }
}
