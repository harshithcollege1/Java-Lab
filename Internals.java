package CIE;
import java.util.Scanner;
public class Internals {
    public int[] internalMarks = new int[5];
    public Internals() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for course " + (i + 1) + ": ");
            internalMarks[i] = scanner.nextInt();
        }
    }
}
