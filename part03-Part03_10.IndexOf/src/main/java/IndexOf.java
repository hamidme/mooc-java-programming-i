
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

         //implement here finding the indices of a number
        System.out.println("Search for?");
        int value = scanner.nextInt();
        int itemIndex = 0;
        while (itemIndex < list.size()) {
            int item = list.get(itemIndex);
            //int itemIndex = list.indexOf(list.get(c));
            if (value == item) {
                System.out.println(value + " is at index " + itemIndex);
            }
            itemIndex += 1;
            
        }
    }
}
