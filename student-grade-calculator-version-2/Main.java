import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Student Grade Calculator ==========");

        System.out.print("Input Student Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Student Name: " + studentName);
        System.out.print("Input Math Score graded over 100: ");
        int mathScore = scanner.nextInt();
        scanner.nextLine();
        if (mathScore > 100 || mathScore < 0){
            System.out.println("Score ranges from 0 to 100 only");
            return;
        }
        System.out.print("Input English Score graded over 100: ");
        int englishScore = scanner.nextInt();
        scanner.nextLine();
        if (englishScore > 100 || englishScore < 0){
            System.out.println("Score ranges from 0 to 100 only");
            return;
        }
        System.out.print("Input French Score graded over 100: ");
        int frenchScore = scanner.nextInt();
        scanner.nextLine();
        if (frenchScore > 100 || frenchScore < 0){
            System.out.println("Score ranges from 0 to 100 only");
            return;
        }
        // Calculate Total & Average

        double totalScore = mathScore + englishScore + frenchScore;
        System.out.println("Total Score: " + totalScore);

        double averageScore = totalScore / 3;
        System.out.println("Average Score: " + averageScore + "/100");

        // Assign Maths Grade
        if (mathScore >= 90){
            System.out.println("Maths Grade: A+: " + mathScore);
        }
        else if (mathScore >= 80 ) {
            System.out.println("Maths Grade: A: " + mathScore);
        }
        else if (mathScore >= 70) {
            System.out.println("Maths Grade: B: " + mathScore);
        }
        else if (mathScore >= 60) {
            System.out.println("Maths Grade: C: " + mathScore);
        }
        else if (mathScore >= 50) {
            System.out.println("Maths Grade: D: " + mathScore);
        }
        else {
            System.out.println("Maths Grade: Fail");
        }

        //Assign English Grade
        if (englishScore >= 90){
            System.out.println("English Grade: A+: " + englishScore);
        }
        else if (englishScore >= 80) {
            System.out.println("English Grade: A: " + englishScore);
        }
        else if (englishScore >= 70) {
            System.out.println("English Grade: B: " + englishScore);
        }
        else if (englishScore >= 60) {
            System.out.println("English Grade: C: " + englishScore);
        }
        else if (englishScore >= 50) {
            System.out.println("English Grade: D: " + englishScore);
        }
        else{
            System.out.println("English Grade: Fail");
        }

        // Assign French Grade
        if (frenchScore >= 90){
            System.out.println("French Grade: A+: " + frenchScore);
        }
        else if (frenchScore >= 80) {
            System.out.println("French Grade: A: " + frenchScore);
        }
        else if (frenchScore >= 70) {
            System.out.println("French Grade: B: " + frenchScore);
        }
        else if (frenchScore >= 60) {
            System.out.println("French Grade: C: " + frenchScore);
        }
        else if (frenchScore >= 50) {
            System.out.println("French Grade: D: " + frenchScore);
        }
        else{
            System.out.println("French Grade: Fail");
        }

    }
}
