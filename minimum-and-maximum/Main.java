package ClassworkAndProjects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------- Exercise 17 ---------------");
        System.out.println("    +++++ Array Maximum Finder +++++      ");
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 100;
        numbers[2] = 15;
        numbers[3] = 55;
        numbers[4] = 35;

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];

            }
            else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);


    }
}
