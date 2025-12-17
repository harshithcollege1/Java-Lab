import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double balance,amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the balance :");
        balance = scanner.nextDouble();
        try{
            System.out.print("Enter the withdrawl amount :");
            amount = scanner.nextDouble();
            if(amount>balance) throw new ArithmeticException("Can't withdraw more than balance");
            balance = balance-amount;
            System.out.println("Balance :" + balance);
        }
        catch (ArithmeticException e){
            System.out.printf(e.getMessage());
        }
        catch (Exception e){
            System.out.println("The Input is Wrong");
        }
        scanner.close();
    }
}
