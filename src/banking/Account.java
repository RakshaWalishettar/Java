package banking;

public class Account {
    public String accountHolderName = "John Doe";
    String bankBranch = "New York";
    private double balance = 1000.50;

    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Branch: " + bankBranch);
        System.out.println("Balance: $" + balance);
    }

    void showBranch() {
        System.out.println("Branch: " + bankBranch);
    }

    private void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}
