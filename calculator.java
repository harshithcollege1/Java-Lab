import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter your First number :");
        a = scanner.nextInt();
        System.out.print("Enter your Second number :");
        b = scanner.nextInt();
        System.out.println("Addition :" + (a+b));
        System.out.println("Substraction :" + (a-b));
        System.out.println("Multiplication :" + (a*b));
        System.out.println("Division :" + (float)(a/b));
        scanner.close();
    }
}