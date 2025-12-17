import java.util.Scanner;
public class quadratic {
    public static void main(String args[]){
        int a,b,c;
        double r1,r2,d;

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your first co-efficient :");
    a = scanner.nextInt();
    System.out.print("Enter your second co-efficient :");
    b = scanner.nextInt();
    System.out.print("Enter your third co-efficient :");
    c = scanner.nextInt();

    if(a==0){
        System.out.println("Roots are possible!");
    }
    else{
        d = (b*b) - (4*a*c);
        if(d<0){
            System.out.println("Roots are imaginary!");
        }
        else if (d == 0){
            r1 = (-b + d)/(2*a);
            System.out.println("Roots are equal!");
            System.out.println("Roots are " + r1 + "and " + r1);
        }
        else{
            r1 = (-b + d)/(2*a);
            r2 = (-b - d)/(2*a);
            System.out.println("Roots are real and distinct!");
            System.out.println("Roots are " + r1 + "and " + r2);
        }
    }
    scanner.close();
    }
}
