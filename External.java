package SEE;
import CIE.Personal;

import java.util.Scanner;

public class External extends Personal {
    public int[] seeMarks = new int[5];

    public External(String name, String usn, int sem) {
        super(name, usn, sem);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for course " + (i + 1) + ": ");
            seeMarks[i] = scanner.nextInt();
        }
    }
}
