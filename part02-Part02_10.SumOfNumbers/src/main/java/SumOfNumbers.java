
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //set sum to 0
        int sum = 0;
        //initialize while loop
        while (true) {
            //prompt user to input a (non-zero) value
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //check if the value is 0
            if (number == 0) {
                // exit if 0
                break;
                // otherwise add number to the sum
            } else{
                sum += number;
            }
        }
        System.out.println(String.format("Sum of the numbers: %d", sum));
    }
}
