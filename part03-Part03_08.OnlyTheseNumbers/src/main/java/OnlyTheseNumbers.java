
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        System.out.println("From where?");
        int getFromWhere = scanner.nextInt();
        
        System.out.println("To where?");
        int getToWhere = scanner.nextInt();
        
        int fromWhere = numbers.get(getFromWhere);
        int toWhere = numbers.get(getToWhere);
        System.out.println(fromWhere);
        System.out.println(toWhere);
        

    }
}
