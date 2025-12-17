import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter account type (savings/current): ");
        String type = sc.nextLine().toLowerCase();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        if (type.equals("savings")) {
            Sav_acct s = new Sav_acct(name, accNo, bal);
            s.displayBalance();
            s.deposit();
            s.computeAndDepositInterest();
            s.withdraw();
            s.displayBalance();
        } 
        else if (type.equals("current")) {
            Cur_acct c = new Cur_acct(name, accNo, bal);
            c.displayBalance();
            c.deposit();
            c.withdraw();
            c.displayBalance();
        } 
        else {
            System.out.println("Invalid account type!");
        }
    }
}
