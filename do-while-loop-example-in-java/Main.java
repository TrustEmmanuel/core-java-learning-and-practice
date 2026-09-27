import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== Repeat Until Yes ==========");
        Scanner scanner = new Scanner(System.in);

        String presetAnswer = "Yes";

        do {
            System.out.print("Do you want to continue? (yes/no): ");
            String inputAnswer = scanner.nextLine();
            if (!inputAnswer.equalsIgnoreCase("yes")){
                System.out.println("Input Yes to continue!");
            }
            else{
                System.out.println("You can Continue!");
                break;
            }
        }while (true);
    }
}
