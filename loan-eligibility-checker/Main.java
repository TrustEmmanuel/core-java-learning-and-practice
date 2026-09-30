import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== Loan Eligibility Checker ==========");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Age: ");
        int customerAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input Monthly Income: ");
        double monthlyIncome = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Are you employed? (yes/no): ");
        String employmentStatus = scanner.nextLine();
        System.out.println("===============================================");

        // Logic
        // Age
        if (customerAge >= 18 && monthlyIncome >= 2000 && employmentStatus.equalsIgnoreCase("Yes")){
            System.out.println("You are eligible for a Loan!");
        }
        else{
            System.out.println("You are not eligible for a Loan");
        }
        scanner.close();
    }
}
