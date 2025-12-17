import CIE.*;
import SEE.*;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Personal[] p = new Personal[n];
        Internals[] in = new Internals[n];
        External[] ex = new External[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Enter USN: ");
            String usn = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();
            sc.nextLine();
            p[i] = new Personal(usn, name, sem);
            System.out.println("Enter Internal Marks:");
            in[i] = new Internals();
            System.out.println("Enter SEE Marks:");
            ex[i] = new External(usn, name, sem);
        }
        System.out.println("\nFinal Marks of All Students");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                int finalMarks = (in[i].internalMarks[j] + ex[i].seeMarks[j]);
                System.out.println("Course " + (j + 1) + " Final Marks: " + finalMarks);
            }
        }
    }
}
