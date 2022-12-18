
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int sum  = 0;
        System.out.println("Last number?");
        int last = scanner.nextInt();
        
        for (int i = start; i <= last; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
