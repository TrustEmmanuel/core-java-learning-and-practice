import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crypto Exchange & Wallet Simulator");

        double walletBalance = 1000.0;
        double bitcoinBalance = 0.0;
        char dollar = '$';
        char bitcoinLogo = '₿';
        Random random = new Random();
        ArrayList<String> transactionHistory = new ArrayList<>();
        boolean enterMarket = true;



        do {
            double coinPrice = random.nextDouble(90.0)+ 10.0;
            StringBuilder receipt = new StringBuilder();
            StringBuilder receiptSell = new StringBuilder();
            System.out.println("++++++++++ CRYPTO WALLET MENU ++++++++++");
            System.out.println("1. Buy Cryptocurrency");
            System.out.println("2. Sell Cryptocurrency");
            System.out.println("3. View Balance");
            System.out.println("4. Hold Bitcoin");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit Market");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Select Option: ");
            int selectOption = scanner.nextInt();
                switch (selectOption){
                    case 1:
                        System.out.println("++++++++++ Buy Crypto ++++++++++");
                        System.out.println("Dollar Wallet Balance: " + walletBalance );
                        System.out.println("1 Bitcoin =: " + coinPrice);
                        System.out.print("Input no of Bitcoin to buy: ");
                        double buyCrypto = scanner.nextDouble();
                        scanner.nextLine();
                        walletBalance = walletBalance - (buyCrypto * coinPrice);
                        bitcoinBalance = bitcoinBalance + buyCrypto;
                        System.out.println("Bitcoin Wallet Balance: " + bitcoinBalance);
                        System.out.println("Dollar Wallet Balance: " + walletBalance);
                        receipt.append("Bought ");
                        receipt.append(buyCrypto);
                        receipt.append(bitcoinLogo);
                        receipt.append(" at ");
                        receipt.append(coinPrice);
                        System.out.println("Receipt: " + receipt);
                        break;
                    case 2:
                        System.out.println("++++++++++ Sell Crypto ++++++++++");
                        System.out.println("Bitcoin Wallet Balance: " + bitcoinBalance);
                        System.out.println("Bitcoin Price: " + coinPrice);
                        System.out.print("Input amount of Bitcoin to sell: ");
                        double sellCrypto = scanner.nextDouble();
                        if (sellCrypto > bitcoinBalance){
                            System.out.println("Invalid Amount, You do not posses that amount of Bitcoin");
                        }
                        else{
                            bitcoinBalance = bitcoinBalance - sellCrypto;
                            walletBalance =  walletBalance + (sellCrypto * coinPrice);
                            System.out.println("Bitcoin Wallet Balance: " + bitcoinBalance);
                            System.out.println("Dollar Wallet Balance: " + walletBalance);
                            receiptSell.append("Sold ");
                            receiptSell.append(sellCrypto);
                            receiptSell.append(bitcoinLogo);
                            receiptSell.append(" at ");
                            receiptSell.append(coinPrice);
                            System.out.println("Receipt: " + receiptSell);
                        }
                    break;
                    case 3:
                        System.out.println("Bitcoin Wallet Balance: " + bitcoinBalance + " " + bitcoinLogo);
                        System.out.println("Dollar Wallet Balance: " + dollar + walletBalance);
                        break;
                    case 4:
                        System.out.println("Press 1 to hold: ");
                        int inputHold = scanner.nextInt();
                        if (inputHold != 1){
                            System.out.print("Kindly Press 1 to hold ");
                            break;
                        }
                        else {
                            System.out.println("++++++++++ Hold Bitcoin ++++++++++");
                            System.out.print("Bitcoin Price:  " + coinPrice);
                            System.out.println("Bitcoin Wallet Balance: " + bitcoinBalance + " " + bitcoinLogo);
                            System.out.println("Dollar Wallet Balance: " + dollar + walletBalance);
                        }
                        break;
                    case 5:
                        System.out.println("++++++++++ Transaction History ++++++++++");
                        transactionHistory.add(String.valueOf(receipt));
                        transactionHistory.add(String.valueOf(receiptSell));
                        System.out.println("Transaction Buy History: " + transactionHistory.get(0));
                        System.out.println("Transaction Sell History: " + transactionHistory.get(1));
                    break;
                    case 6:
                        System.out.println("Exiting Market.....");
                        enterMarket = false;
                        break;
                    default:
                        System.out.println("Invalid Selection...");
                        break;
                }

        }while (enterMarket);

    }
}
