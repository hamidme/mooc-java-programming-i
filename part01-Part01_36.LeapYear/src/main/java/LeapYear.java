
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int yearGiven = Integer.valueOf(scan.nextLine());

        if (yearGiven % 4 == 0 && yearGiven%100 !=0) {
            System.out.println("The year is a leap year.");
        } else if (yearGiven % 100 == 0 && yearGiven % 400 == 0) {
            System.out.println("The year is a leap year.");
        }else {
            System.out.println("The year is not a leap year.");
        }

    }
}
