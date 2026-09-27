import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 9900;
        boolean loggedIn = false;
        System.out.println("+++++ Contact Directory +++++");
        ArrayList<String> contactNames = new ArrayList<>();
        ArrayList<Integer> phoneNumbers = new ArrayList<>();
        contactNames.add("Emmanuel");
        contactNames.add("Chinelo");
        contactNames.add("John");
        contactNames.add("Phillip");
        contactNames.add("Maureen");
        contactNames.add("Abosede");
        contactNames.add("Blessing");
        contactNames.add("Chijioke");
        contactNames.add("Ebenezer");

        phoneNumbers.add(100111);
        phoneNumbers.add(100222);
        phoneNumbers.add(100333);
        phoneNumbers.add(100444);
        phoneNumbers.add(100555);
        phoneNumbers.add(100666);
        phoneNumbers.add(100777);
        phoneNumbers.add(100888);
        phoneNumbers.add(100999);

        
        System.out.print("Input Username: ");
        String inputUsername = scanner.nextLine();

        for (int i = 3; i >= 0; i--) {

            System.out.print("Input Pin: ");
            int inputPin = scanner.nextInt();

            if (inputPin == correctPin){
                System.out.println("Access granted!");
                loggedIn = true;
                break;
            }
            else {
                System.out.println("Invalid Credentials, Try Again");
            }
        }
        if (!loggedIn){
            System.out.println("Account Locked Contact Admin");
        }
        else{
            System.out.println("Welcome " + inputUsername + "!");
            System.out.println(" +++++ " + inputUsername + "'s" + " Contact Directory Menu" + " +++++ ");

            while (loggedIn){
                System.out.println("(1) View All Contacts");
                System.out.println("(2) Search Contacts by name");
                System.out.println("(3) Search Contacts by phone number");
                System.out.println("(4) Update Contact phone number");
                System.out.println("(5) Update Contact name ");
                System.out.println("(6) Add Contact ");
                System.out.println("(7) Exit Menu");
                System.out.println("---------------------------------");
                System.out.print("Select Option: ");
                int selectOption = scanner.nextInt();
                scanner.nextLine();

                switch (selectOption){
                    case 1:
                        System.out.println("+++++ View All Contacts +++++");
                        viewAllContacts(contactNames,phoneNumbers);
                        System.out.println("-----------------------------------------");
                        break;
                    case 2: // Search for Contacts
                        System.out.println("+++++ Search Contacts +++++");
//                    System.out.println("Input Contact Name: ");
//                    String inputContactName = scanner.nextLine();
//                    boolean found= false;
//
//                    for (String findName: contactNames){
//                        if (findName.equalsIgnoreCase(inputContactName))
//                            found = true;
//                        break;
//                    }
//                    if (found){
//                        System.out.println("Contact Found: " + inputContactName);
//                    }
//                    else{
//                        System.out.println("Contact Not Found");
//                    }
                        findContact(contactNames);
                        System.out.println("-----------------------------------------");
                        break;
                    case 3:
                        System.out.println("+++++ Search Contacts by phone number +++++");
//                    System.out.println("Input Contact Phone Number: ");
//                    int inputNumOfContact = scanner.nextInt();
//                    scanner.nextLine();
//
//                    for (int i = 0; i < phoneNumbers.size(); i++) {
//                        if (phoneNumbers.contains(inputNumOfContact)){
//                           int showNumber = phoneNumbers.indexOf(inputNumOfContact);
//                           String showContactName = contactNames.get(showNumber);
//                            System.out.println("Contact Name: " + showContactName);
//                            break;
//                        }
//                        else{
//                            System.out.println("This Number does not exist");
//                        }
//                    }
                        findContact(phoneNumbers,contactNames);
                        System.out.println("-----------------------------------------");
                        break;
                    case 4:
                        System.out.println("+++++ Update Contact phone number +++++");
//                    System.out.println("Update Contact phone number");
//                    System.out.println("Input Contact Phone Number: ");
//                    int inputNumOfContact = scanner.nextInt();
//                    scanner.nextLine();
//
//                    for (int i = 0; i < phoneNumbers.size(); i++) {
//                        if (phoneNumbers.contains(inputNumOfContact)){
//                           int showNumber = phoneNumbers.indexOf(inputNumOfContact);
//                           String showContactName = contactNames.get(showNumber);
//                           int showContactNumber = phoneNumbers.get(showNumber);
//                           System.out.println("Contact Name: " + showContactName);
//                           System.out.println("Contact Number: " + showContactNumber);
//                           System.out.println("Update Phone Number: ");
//                           int inputPhoneNumber = scanner.nextInt();
//                           scanner.nextLine();
//                           int updateNumber = phoneNumbers.set(showNumber,inputPhoneNumber);
//                           int updatedNumber = phoneNumbers.get(showNumber);
//                           System.out.println("Number updated to: " + updatedNumber + " for " + contactNames.get(showNumber));
//                            break;
//                        }
//                        else{
//                            System.out.println("This Number does not exist");
//                        }
//                    }
                        updateNumber(contactNames,phoneNumbers);
                        System.out.println("-----------------------------------------");
                        break;
                    case 5:
                        System.out.println("+++++ Update Contact name +++++");
                        System.out.println("-----------------------------------------");
                        updateContactName(contactNames);
                        break;
                    case 6:
                        System.out.println("+++++ Add Contact +++++");
                        System.out.println("-----------------------------------------");
                        addNumber(contactNames,phoneNumbers);
                        break;
                    case 7:
                        System.out.println("+++++ Exit Menu +++++");
                        System.out.println("Exiting Application..........");
                        loggedIn = false;
                        System.out.println("-----------------------------------------");
                        break;
                    default:
                        System.out.println("Invalid Selection, input a correct selection and proceed");
                        System.out.println("-----------------------------------------");
                        break;
                } // end switch statement.

            }
        }

    } //  end main

    // METHODS
    public static void viewAllContacts(ArrayList<String> viewCon, ArrayList<Integer> viewPhone){
        for (int i = 0; i < viewCon.size(); i++) {
            System.out.println("Student Names: " + viewCon.get(i));
            System.out.println("Student Numbers: " + viewPhone.get(i));
            System.out.println("----------------------------------------");
        }
    }
    public static void findContact(ArrayList<String> conNames){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Contact Name: ");
        String inputContactName = scanner.nextLine();
        boolean found= false;

        for (String contactName:conNames ){
            if (contactName.equalsIgnoreCase(inputContactName)){
                System.out.println("Search Complete");
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Contact Found: " + inputContactName );
        }
        else{
            System.out.println("Contact not found");
        }
    }
    public static void findContact(ArrayList<Integer> contactNumber, ArrayList<String> contactNames){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Input Contact Phone Number: ");
        int inputNumOfContact = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < contactNumber.size(); i++) {
            if (contactNumber.contains(inputNumOfContact)){
                int showNumber = contactNumber.indexOf(inputNumOfContact);
                String showContactName = contactNames.get(showNumber);
                System.out.println("Contact Name: " + showContactName);
                break;
            }
            else{
                System.out.println("This Number does not exist");
                break;
            }
        }
    }
    public static void updateNumber(ArrayList<String>contactName, ArrayList<Integer>contactNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update Contact phone number");
        System.out.print("Input Contact Phone Number: ");
        int inputNumOfContact = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < contactNumber.size(); i++) {
            if (contactNumber.contains(inputNumOfContact)){
                int showNumber = contactNumber.indexOf(inputNumOfContact);
                String showContactName = contactName.get(showNumber);
                int showContactNumber = contactNumber.get(showNumber);
                System.out.println("Contact Name: " + showContactName);
                System.out.println("Contact Number: " + showContactNumber);
                System.out.print("Update Phone Number: ");
                int inputPhoneNumber = scanner.nextInt();
                scanner.nextLine();
                int updateNumber = contactNumber.set(showNumber,inputPhoneNumber);
                int updatedNumber = contactNumber.get(showNumber);
                System.out.println("Number updated to: " + updatedNumber + " for " + contactName.get(showNumber));
                break;
            }
            else{
                System.out.println("This Number does not exist");
            }
        }
    }
    public static void updateContactName(ArrayList<String> conNames){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Contact Name: ");
        String inputContactName = scanner.nextLine();
        boolean found= false;
        int foundName = 0;

        for (String contactName : conNames ){
            if (contactName.equalsIgnoreCase(inputContactName)){
                System.out.println("Search Complete");
                found = true;
                foundName = contactName.indexOf(inputContactName);
                break;
            }
        }
        if (found){
            System.out.println("Contact Found: " + inputContactName);
            System.out.println("Index of Name: " + foundName);
            System.out.print("Input New Name: ");
            String inputNewName = scanner.nextLine();
            conNames.set(foundName,inputNewName);
            System.out.println("New Name Updated to: " + conNames.get(foundName));
        }
        else{
            System.out.println("Contact not found");
        }
    }
    public static void addNumber(ArrayList<String> contactNames, ArrayList<Integer> contactNumber){
        Scanner scanner = new Scanner(System.in);
        int getIndexName = 0;
        int getIndexNumber = 0;
        System.out.print("Input Contact Name to add: ");
        String inputNewContact = scanner.nextLine();
        System.out.print("Input Contact number: ");
        int inputNewNumber = scanner.nextInt();
        scanner.nextLine();
        contactNames.add(inputNewContact);
        contactNumber.add(inputNewNumber);


        for (int i = 0; i < contactNames.size(); i++) {
            getIndexName = contactNames.indexOf(inputNewContact);
            getIndexNumber = contactNumber.indexOf(inputNewNumber);
        }
        String getNameNow = contactNames.get(getIndexName);
        int getNumberNow = contactNumber.get(getIndexNumber);

        System.out.println("New Name Added: " + getNameNow);
        System.out.println("New Number Added: " + getNumberNow);
    }
}