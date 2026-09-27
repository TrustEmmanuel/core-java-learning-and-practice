public class Main {

    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.accountNumber = 987654321;
        myBankAccount.balance = 5000;
        myBankAccount.accountName = "Emmanuel";
        myBankAccount.isActive = true;

        // Call Methods
        myBankAccount.deposit();
        myBankAccount.withdrawal();
        myBankAccount.checkBalance();


        System.out.println("Is Account Active: " + myBankAccount.isActive);

    }
}
