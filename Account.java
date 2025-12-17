import java.util.Scanner;

class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    Scanner sc = new Scanner(System.in);

    public Account(String name, String accNo, String type, double bal) {
        customerName = name;
        accountNumber = accNo;
        accountType = type;
        balance = bal;
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
