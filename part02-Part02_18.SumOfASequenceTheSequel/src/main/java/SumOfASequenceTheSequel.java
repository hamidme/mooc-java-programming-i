
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int start = scanner.nextInt();
        int sum  = 0;
        System.out.println("Last number?");
        int last = scanner.nextInt();
        
        for (int i = start; i <= last; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
