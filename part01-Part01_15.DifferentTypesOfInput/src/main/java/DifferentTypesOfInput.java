
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String userInput = scan.nextLine();
        System.out.println("Give an integer:");
        int intUserInput = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleUserInput = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanUserInput = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + userInput);
        System.out.println("You gave the integer " + intUserInput);
        System.out.println("You gave the double " + doubleUserInput );
        System.out.println("You gave the boolean " + booleanUserInput);
    }
}
