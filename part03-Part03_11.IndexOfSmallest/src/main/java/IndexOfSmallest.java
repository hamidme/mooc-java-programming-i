
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        int index = 0;
        int getMin = list.get(0);

        while (index < list.size()) {
            int listItem = list.get(index);

            if (listItem < getMin) {
                getMin = listItem;
            }
            index += 1;
        }

        System.out.println("Smallest number: " + getMin);
        System.out.println("Found at index: " + list.indexOf(getMin));

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
