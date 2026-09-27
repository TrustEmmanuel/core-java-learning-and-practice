
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> stock = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isStoreOpen = true;

        // List of Items
        items.add("Spanners");
        items.add("Wrenches");
        items.add("Saw");
        items.add("Lawnmower");
        items.add("Scissors");

        // List of Stock
        stock.add(10);
        stock.add(10);
        stock.add(12);
        stock.add(5);
        stock.add(2);

        // Price of Items
        price.add(12.21);
        price.add(10.16);
        price.add(5.50);
        price.add(29.21);
        price.add(5.00);

        ArrayList<String> saveItems = new ArrayList<>();
        ArrayList<Integer> saveQuantities = new ArrayList<>();
        ArrayList<Double> sumTotal = new ArrayList<>();

        double getReceipt = 0;


        do {
            System.out.println("========== Welcome to Emmanuel's Hardware Store ==========");
            System.out.println("1. View Items");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Items and Checkout");
            System.out.print("Select Option: ");
            int selectOption = scanner.nextInt();
            switch (selectOption){
                case 1:
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println("Items: " + items.get(i));
                        System.out.println("Stock: " + stock.get(i));
                        System.out.println("Price: " + price.get(i));
                        System.out.println("-----------------------------");

                    }
                    break;
                case 2:
                    while (true){
                        System.out.print("Select (1 to 5) for Item to Purchase: "
                                + " Press 0 to exit selection: ");

                        int selectItem = scanner.nextInt();
                        scanner.nextLine();
                        if (selectItem == 1){
                            items.get(0);
                            System.out.println("Item Selected: " + items.get(0));
                            System.out.println("Price of Item: " + price.get(0));
                            System.out.print( "Input number of items you want to buy: ");
                            int noOfItems1 = scanner.nextInt();
                            if (noOfItems1 <= stock.get(0)){
                                double getPrice1 = price.get(0);
                                double calculatedAmount1 = getPrice1 * noOfItems1;
                                saveQuantities.add(noOfItems1);
                                sumTotal.add(calculatedAmount1);
//                                    System.out.printf("Total Amount: %.2f\n " , calculatedAmount1);
                            }
                            else{
                                System.out.println("Out of Stock, we just have "
                                        + stock.get(0) + " amount in stock");
                            }
                        }
                        if (selectItem == 2){
                            items.get(1);
                            System.out.println("Item Selected: " + items.get(1));
                            System.out.println("Price of Item: " + price.get(1));
                            System.out.print( "Input number of items you want to buy: ");
                            int noOfItems2 = scanner.nextInt();
                            if (noOfItems2 <= stock.get(1)){
                                double getPrice2 = price.get(1);
                                double calculatedAmount2 = getPrice2 * noOfItems2;
                                saveQuantities.add(noOfItems2);
                                sumTotal.add(calculatedAmount2);
//                                    System.out.printf("Total Amount: %.2f\n " , calculatedAmount2);
                            }
                            else{
                                System.out.println("Out of Stock, we just have "
                                        + stock.get(1) + " amount in stock");
                            }
                        }
                        if (selectItem == 3){
                            items.get(2);
                            System.out.println("Item Selected: " + items.get(2));
                            System.out.println("Price of Item: " + price.get(2));
                            System.out.print( "Input number of items you want to buy: ");
                            int noOfItems3 = scanner.nextInt();
                            if (noOfItems3 <= stock.get(2)){
                                double getPrice3 = price.get(2);
                                double calculatedAmount3 = getPrice3 * noOfItems3;
                                saveQuantities.add(noOfItems3);
                                sumTotal.add(calculatedAmount3);
                                System.out.printf("Total Amount: %.2f\n " , calculatedAmount3);
                            }
                            else{
                                System.out.println("Out of Stock, we just have "
                                        + stock.get(2) + " amount in stock");
                            }

                        }
                        if (selectItem == 4){
                            items.get(3);
                            System.out.println("Item Selected: " + items.get(3));
                            System.out.println("Price of Item: " + price.get(3));
                            System.out.print( "Input number of items you want to buy: ");
                            int noOfItems4 = scanner.nextInt();
                            if (noOfItems4 <= stock.get(3)){
                                double getPrice4 = price.get(3);
                                double calculatedAmount3 = getPrice4 * noOfItems4;
                                saveQuantities.add(noOfItems4);
                                sumTotal.add(calculatedAmount3);
//                                  System.out.printf("Total Amount: %.2f\n " , calculatedAmount3);
                            }
                            else{
                                System.out.println("Out of Stock, we just have "
                                        + stock.get(3) + " amount in stock");
                            }
                        }
                        if (selectItem == 5){
                            items.get(4);
                            System.out.println("Item Selected: " + items.get(4));
                            System.out.println("Price of Item: " + price.get(4));
                            System.out.print( "Input number of items you want to buy: ");
                            int noOfItems5 = scanner.nextInt();
                            if (noOfItems5 <= stock.get(4)){
                                double getPrice5 = price.get(4);
                                double calculatedAmount5 = getPrice5 * noOfItems5;
                                System.out.printf("Total Amount: %.2f\n " , calculatedAmount5);
                                saveQuantities.add(noOfItems5);
                                sumTotal.add(calculatedAmount5);
                            }
                            else{
                                System.out.println("Out of Stock, we just have "
                                        + stock.get(4) + " amount in stock");
                            }
                        }
                        if (selectItem > 5 ){
                            System.out.println("Invalid Option");
                        } else if (selectItem == 0) {
                            System.out.println("Exiting...");
                            break;
                        }
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("--------------- Sum Total ---------------");
                    System.out.printf("Receipt:" + sumTotal);
                    for (int i = 0; i < sumTotal.size(); i++) {
                        getReceipt = sumTotal.get(i) + getReceipt;
                    }
                    System.out.println();
                    System.out.println("Receipt Amount: " + getReceipt);
                    break;
            }
        }while (isStoreOpen);


    }
}

