import java.io.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName;
        System.out.print("Enter filename :");
        fileName = scanner.nextLine();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("File can be read");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found !!");
        }
        scanner.close();
    }
}
