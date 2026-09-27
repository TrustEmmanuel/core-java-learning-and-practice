

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- Shopping Cart & Checkout Simulator ---------");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> cartPrices = new ArrayList<>();
        ArrayList<String> cartProduct = new ArrayList<>();
        boolean withinApp = true;
        boolean adding = true;
        double sumCart = 0;



        // Product List
        products.add("Apples");
        products.add("Orange");
        products.add("Water");
        products.add("Pears");
        products.add("Cabbages");
        products.add("Grape");
        products.add("Mango");
        products.add("Lemon");
        products.add("Tangerine");
        products.add("Guava");

        // Product Price List
        prices.add(1.20);
        prices.add(2.00);
        prices.add(0.50);
        prices.add(1.50);
        prices.add(2.20);
        prices.add(3.15);
        prices.add(1.80);
        prices.add(1.30);
        prices.add(2.10);
        prices.add(3.20);


        System.out.println("+++++ Product List +++++");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Item Index - " + i + " || Item Name - "
                    + products.get(i) + " || Item Price - $" + prices.get(i));
            System.out.println("___________________________________");
        }
        do {
            System.out.println("+++++ Product Mart +++++");
            System.out.println("(1) Add Item to Cart");
            System.out.println("(2) Remove Item from Cart");
            System.out.println("(3) View Current Cart");
            System.out.println("(4) Checkout Cart");
            System.out.println("___________________");
            System.out.print("Select Option: ");
            int selectOption = scanner.nextInt();
            scanner.nextLine();

            switch (selectOption){
                case 1:
                    System.out.println("+++++ Add Item to Cart +++++");
                    System.out.print("Input Index of Item to add (Input 100 to stop addition): ");
                    int inputIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (inputIndex == 100 || inputIndex > products.size() - 1){
                        System.out.println("Addition Stopped");
                        break;
                    }
                    else{
                        System.out.print("How many of the Items do you want to add: ");
                        int itemNumber = scanner.nextInt();
                        scanner.nextLine();
                        double getPrice = prices.get(inputIndex);
                        double getPriceAndNumber = getPrice * itemNumber;
                        cartPrices.add(getPriceAndNumber);
                        String getProductName = products.get(inputIndex);
                        cartProduct.add(getProductName);
                        for (int j = 0; j < cartPrices.size(); j++) {
                            System.out.println("Item - " + cartProduct.get(j)
                                    + " || " + "Price - $" + cartPrices.get(j));
                        }
                    }
                    break;
                case 2:
                    System.out.println("+++++ Remove Item from Cart +++++");
                    for (int a = 0; a < cartProduct.size(); a++) {
                        System.out.println("Product Index: " + a + " || " + "Product Name: " + cartProduct.get(a)
                                + " || " + "Product Price: " + cartPrices.get(a));

                    }
                    System.out.print("Input Index of Item to remove:");
                    int inputRemoveIndex = scanner.nextInt();
                    scanner.nextLine();
                    cartProduct.remove(inputRemoveIndex);
                    cartPrices.remove(inputRemoveIndex);
                    System.out.println("Item at Index " + inputRemoveIndex + " removed");
                    break;
                case 3:
                    System.out.println("+++++ View Current Cart +++++");
                    for (int l = 0; l < cartProduct.size(); l++) {
                        System.out.println("Item - " + cartProduct.get(l)
                                + " || " + "Price - $" + cartPrices.get(l));
                    }
                    break;
                case 4:
                    System.out.println("+++++ Checkout Cart +++++");
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("          RECEIPT          ");
                    System.out.println("+++++++++++++++++++++++++++++");
                    for (int m = 0; m < cartPrices.size(); m++) {
                        sumCart = sumCart + cartPrices.get(m);
                        System.out.println("Item - " + cartProduct.get(m)
                                + " || " + "Price - $" + cartPrices.get(m));
                    }
                    System.out.println("Sum Amount: $" + sumCart);
                    withinApp = false;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }while (withinApp);
        scanner.close();
    }
}
