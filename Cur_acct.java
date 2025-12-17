class Cur_acct extends Account {
    final double MIN_BAL = 1000;
    final double PENALTY = 100;

    public Cur_acct(String name, String accNo, double bal) {
        super(name, accNo, "Current", bal);
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
            checkMinimumBalance();
        }
    }

    private void checkMinimumBalance() {
        if (balance < MIN_BAL) {
            balance -= PENALTY;
            System.out.println("Balance below minimum. Penalty of " + PENALTY + " imposed.");
            System.out.println("Updated balance: " + balance);
        }
    }
}
