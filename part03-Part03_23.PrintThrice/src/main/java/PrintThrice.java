
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name? ");
        // reading a line from the user and assigning it to the name variable
        String name = scanner.nextLine();
        System.out.println(name+name+name);

    }
}
