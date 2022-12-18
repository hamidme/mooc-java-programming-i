
import java.util.Scanner;

public class AverageOfNumbers {

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
            } else {
                count+=1;
                sum += number;
            }
        }
        double avg = sum/(count*1.0);
        System.out.println(String.format("Average of the numbers: %s", avg));
    }
}
