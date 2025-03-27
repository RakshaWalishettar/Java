package customer;
import banking.Account;


public class Customer {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println("Account Holder: " + acc.accountHolderName);
        acc.showAccountDetails();
        System.out.println("=============================");
    }
}

