
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playing = true;
        System.out.println("++++++++++ Rock, Paper Scissors ++++++++++");


        System.out.println("----- Rules of the Game -----");

        while (playing){
            int computerTurn = random.nextInt(3) + 1;
            System.out.println("Press \"1\" for Rock");
            System.out.println("Press \"2\" for Paper");
            System.out.println("Press \"3\" for Scissors");
            System.out.println("Press \"0\" to quit");

            System.out.println("---------------------------");

            System.out.print("Input Option: ");
            int inputOption = scanner.nextInt();
            scanner.nextLine();


            System.out.println("The Computer selected " + computerTurn);


            if (inputOption < 1 || inputOption > 3 ){
                if (inputOption == 0){
                    System.out.println("You Selected " + inputOption + " to exit");
                    playing = false;
                    break;

                }
                System.out.println("You Selected " + inputOption + " Please select from range 1 to 3 ");
                System.out.println("---------------------------");
            }
            else if (inputOption == 1 || inputOption == 2 || inputOption == 3){
                System.out.println("You selected " + inputOption);

            }
            if (inputOption == 1 && computerTurn == 2 ){
                System.out.println("********************");
                System.out.println("Paper Beats Rock! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 1 && computerTurn == 3 ){
                System.out.println("********************");
                System.out.println("Rock Beats Paper! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 1 && computerTurn == 1 ){
                System.out.println("********************");
                System.out.println("Paper ties Paper! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 2 && computerTurn == 1 ){
                System.out.println("********************");
                System.out.println("Paper Beats Rock! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 2 && computerTurn == 2 ){
                System.out.println("********************");
                System.out.println("Paper ties Paper! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 2 && computerTurn == 3 ){
                System.out.println("********************");
                System.out.println(" Scissors Beats Paper! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 3 && computerTurn == 1 ){
                System.out.println("********************");
                System.out.println("Rock Beats Scissors! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 3 && computerTurn == 2 ){
                System.out.println("********************");
                System.out.println("Scissors Beats Paper! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }
            if (inputOption == 3 && computerTurn == 3 ){
                System.out.println("********************");
                System.out.println("Scissors ties Scissors! ");
                System.out.println("********************");
                System.out.println("---------------------------");
            }

        }

        scanner.close();
    }
}
