
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String newPinpin = "";
        while (true) {
            String story = scanner.nextLine();
            if (story.equals("")) {
                break;
            }
            String[] pinpin = story.split(",");
            int age = Integer.valueOf(pinpin[1]);
            if(age > oldest){
                oldest = age;
                newPinpin = pinpin[0];
            }
        }
        System.out.println(newPinpin);
    }
}
