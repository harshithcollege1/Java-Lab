import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        a = scanner.nextDouble();
        System.out.print("Enter the second number :");
        b = scanner.nextDouble();
        try{
            if(b == 0){
                throw new ArithmeticException();
            }
            double c = a /b;
            System.out.println("a/b = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        scanner.close();
    }
}