
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String story = scanner.nextLine();
            if (story.equals("")) {
                    break;
                }
            String[] pinpin = story.split(" ");
            for (String s : pinpin) {
                System.out.println(s);
            }
            
        }

    }
}
