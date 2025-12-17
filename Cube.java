import java.util.Scanner;
public class Cube {
    double length;
    double breadth;
    double height;
    Scanner scanner = new Scanner(System.in);
    void read(){
        System.out.print("Enter your length :");
        this.length = scanner.nextDouble();
        System.out.print("Enter your breadth :");
        this.breadth = scanner.nextDouble();
        System.out.print("Enter your height :");
        this.height = scanner.nextDouble();
    }
    void display(){
        System.out.println("Length :" + this.length);
        System.out.println("breadth :" + this.breadth);
        System.out.println("height :" + this.height);
    }
    void volume(){
        System.out.println("Volume : " + (length*breadth*height));
    }
}
