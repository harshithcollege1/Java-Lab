class Sav_acct extends Account {
    public Sav_acct(String name, String accNo, double bal) {
        super(name, accNo, "Savings", bal);
    }
    // Compute and deposit interest
    public void computeAndDepositInterest() {
        double rate = 0.05; // 5% interest
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. Updated balance: " + balance);
    }
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
    }
}