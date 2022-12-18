
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        int factorial  = 1;
        System.out.println("Last number?");
        int last = scanner.nextInt();
        
        for (int i = start; i <= last; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
