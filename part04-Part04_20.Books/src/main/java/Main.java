
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, publicationYear));

        }

        System.out.println("What information will be printed? ");
        String answer = scanner.nextLine();

        if (answer.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
        if (answer.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }

        }
        
        

    }
}
