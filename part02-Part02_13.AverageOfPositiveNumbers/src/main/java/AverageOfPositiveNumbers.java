
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //set count to
        int count = 0;
        //set sum to 0
        int sum = 0;
        //initialize while loop
        while (true) {
            //prompt user to input a (non-zero) value
            int number = Integer.valueOf(scanner.nextLine());
            //check if the value is 0
            if (number == 0) {
                // exit if 0
                break;
        
            }
            
            if (number > 0) {
                count += 1;
                sum += number;

            }

        }
        //calculate the average
        double avg = sum / (count * 1.0);
        if (count == 0) {
            //If no positive number is inputted
            System.out.println("Cannot calculate the average");
        } else {
            //otherwise return the average
            System.out.println(String.format("%s", avg));
        }

    }
}
