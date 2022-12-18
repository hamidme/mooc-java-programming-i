
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
   
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
              numbers.add(number);
            }
        }
        int one = numbers.get(1);
        int two = numbers.get(2);
        int result = one + two;
        System.out.println(result);
    }
}
