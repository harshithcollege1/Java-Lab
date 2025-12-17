import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no.of books :");
        int n = scanner.nextInt();
        scanner.nextLine();
        Book[] books = new Book[n];
        for(int i = 0 ; i<n;i++){
            System.out.println("Enter the details of book "+ (i+1));
            System.out.print("Enter book name :");
            String name = scanner.nextLine();
            System.out.print("Enter author name :");
            String author = scanner.nextLine();
            System.out.print("Enter price for the Book :");
            double price = scanner.nextDouble();
            System.out.print("Enter the # pages :");
            int num_of_pages = scanner.nextInt();
            scanner.nextLine();
            books[i] = new Book(name,author,price,num_of_pages);
        }
        for(int i = 0;i<n;i++){
            System.out.println("Book "+ (i+1)+ " Details : ");
            System.out.println(books[i]);
        }
    }
}