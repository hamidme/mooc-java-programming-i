
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        int anInt = Integer.valueOf(scan.nextLine());
        if (anInt > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }

    }
}
