
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //capture user input and save to program memory
        String message = scanner.nextLine();
        
        //print the message writtern by the user
        System.out.println(message);

    }
}
