
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //set count to
        int count = 0;
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
                // and increment count by 1
            } else {
                count+=1;
                sum += number;
            }
        }
        System.out.println(String.format("Number of numbers: %d", count));
        System.out.println(String.format("Sum of the numbers: %d", sum));
    }
}
