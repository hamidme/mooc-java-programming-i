
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String story = scanner.nextLine();
            if (story.equals("")) {
                break;
            }
            String[] pinpin = story.split(" ");

            System.out.println(pinpin[pinpin.length - 1]);

        }

    }
}
