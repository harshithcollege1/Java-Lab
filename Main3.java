import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int choice,size;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of the array :");
        size = scanner.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter " + (i+1) + " number :");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the index you want :");
        choice = scanner.nextInt();
        try{
            System.out.println("Here is the element :" + array[choice]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of range!");
        }
        scanner.close();
    }
}
