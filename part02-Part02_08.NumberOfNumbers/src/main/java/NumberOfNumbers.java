
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //set count to 0
        int count = 0;
        //initialize while loop
        while (true) {
            //prompt user to input a (non-zero) value
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //check if the value is 0
            if (number == 0) {
                // exit if 0
                break;
                // otherwise increment the count by 1
            } else {
                count += 1;
            }
        }
        System.out.println(String.format("Number of numbers: %d", count));
    }
}
