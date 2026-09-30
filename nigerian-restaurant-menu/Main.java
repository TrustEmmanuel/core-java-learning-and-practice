import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Switch Statement Practice =====");

        System.out.println("Nigerian Restaurant Menu");
        System.out.println("(1) Rice");
        System.out.println("(2) Beans");
        System.out.println("(3) Swallow");

        double priceRice = 19.23;
        double priceBeans = 12.25;
        double priceSwallow = 15.21;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Select what you want to eat: ");
        String selectMeal = scanner.nextLine();

        switch (selectMeal.toLowerCase()){
            case "rice":
                System.out.println("You Selected Rice!");
                if (selectMeal.equalsIgnoreCase("rice")){
                    System.out.println("Amount:" + "$" + priceRice);
                    break;
                }
            case "beans":
                System.out.println("You selected Beans!");
                if (selectMeal.equalsIgnoreCase("beans")){
                    System.out.println("Amount:" + "$" + priceBeans);
                    break;
                }
            case "swallow":
                System.out.println("You selected Swallow");
                if (selectMeal.equalsIgnoreCase("swallow")){
                    System.out.println("Amount:" + "$" + priceSwallow);
                    break;
                }
            default:
                System.out.println("Exi");

        }
        scanner.close();
    }
}