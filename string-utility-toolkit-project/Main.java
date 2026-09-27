import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("++++++++++ The Ultimate String Utility Toolkit ++++++++++");
        StringBuilder paragraph = new StringBuilder();

        System.out.print("Write a simple paragraph of something you like: ");
        String inputParagraph = scanner.nextLine();
        paragraph.append(inputParagraph);
        System.out.println("Paragraph Written: " + paragraph);
        System.out.println("________________________________________________");

        boolean loggedIn = true;

        while (loggedIn){
            System.out.println("++++++++++ Menu ++++++++++"); // Menu to select options
            System.out.println("(1) Count Vowels and Consonants");
            System.out.println("(2) Check Palindrome");
            System.out.println("(3) Word Counter");
            System.out.println("(4) Text Encryptor");
            System.out.println("(5) Exit Program");
            System.out.println("________________________________________________");
            System.out.print("Select The Option for what you want to do: ");
            int selectOption = scanner.nextInt();
            scanner.nextLine();

            switch (selectOption){
                case 1:
                    System.out.println("+++++ Count Vowels and Consonants +++++");
                    System.out.println("My Paragraph: " + paragraph);
                    vowelAndConsonantCount(inputParagraph);
                    break;
                case 2:
                    System.out.println("+++++ Check Palindrome +++++");
                    System.out.println("My Paragraph: " + paragraph);
                    reverseParagraph(inputParagraph);
                    break;
                case 3:
                    System.out.println("+++++ Word Counter +++++");
                    System.out.println("My Paragraph: " + paragraph);
                    countParagraph(paragraph);
                    break;
                case 4:
                    System.out.println("+++++ Text Encryptor +++++");
                    textEncrypt(paragraph);
                    break;
                case 5:
                    exitProgram();
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }
    }
    // Methods
    public static void reverseParagraph(String inputString){ // Method to reverse paragraph
        StringBuilder newEntry = new StringBuilder();
        newEntry.append(inputString);
        newEntry.reverse();
        String convertString = newEntry.toString();
        System.out.println("Paragraph: " + convertString);

        if (inputString.equals(convertString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    } // end reverse paragraph Method

    public static void countParagraph(StringBuilder inputString){ //  Method to count paragraph
        int capacity = inputString.capacity();
        System.out.println("Word Count: " + capacity);
    } // end count paragraph method

    public static void vowelAndConsonantCount(String input){
        String convertLower = input.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < convertLower.length(); i++) {
            char character = convertLower.charAt(i);

            if (character == 'a' || character == 'e' || character =='i' || character == 'o' || character == 'u'){
                vowelCount++;
            }

        }
        System.out.println("Vowels: " + vowelCount);

        for (int j = 0; j < convertLower.length(); j++) {
            char character = convertLower.charAt(j);

            if (character == 'b' || character == 'c'
                    || character =='d' || character == 'f'
                    || character == 'g'|| character == 'h'
                    || character == 'j'|| character == 'k'
                    || character == 'l' || character == 'm'
                    || character == 'p'|| character == 'q'
                    || character == 'r'|| character == 's'
                    || character == 't'|| character == 'v'
                    || character == 'w'|| character == 'x'
                    || character == 'y'|| character == 'z')
            consonantCount++;
        }
        System.out.println("Consonants: " + consonantCount);

    }
    public static void textEncrypt(StringBuilder input){
        input.insert(3,"fvygbuhji");
        input.insert(1, 29805329);
        input.reverse();
        System.out.println("Encrypted Message: " + input);
    }
    public static void exitProgram(){
        System.out.println("Exiting.....");
    }


}