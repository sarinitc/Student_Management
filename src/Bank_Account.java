public class Bank_Account {

    // 🔒 Private attributes
    private int accountNumber;
    private String ownerName;
    private double balance;

    // 🧱 Constructor
    public Bank_Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // ➕ Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Deposit must be greater than 0");
        }
    }

    // ➖ Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful: " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    // 💰 Get balance
    public double getBalance() {
        return balance;
    }

    // 🖨 Display account info
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

}
