import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] getNumber = menu();
        System.out.print("Number Choice: " + Arrays.toString(getNumber));
        isEven(getNumber[0]);



    }
    public static int [] menu(){
        System.out.print("Input Number: ");
        int inputNumber = scanner.nextInt();
        return new int []{inputNumber};
    }
    public static boolean isEven(int x){
        if (x %2 == 0){
            System.out.println("This is an Even Number");
        }
        else {
            System.out.println("This is an odd Number");
        }
        return true;
    }

}


