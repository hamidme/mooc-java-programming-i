
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int nameLength = 0;
        String longestName = "";
        int sum = 0;
        int index = 0;
        String newPinpin = "";
        while (true) {
            String story = scanner.nextLine();
            if (story.equals("")) {
                break;
            }
            String[] pinpin = story.split(",");
            String name = pinpin[0];
            int age = Integer.valueOf(pinpin[1]);
            sum+=age;
            if(name.length() > nameLength){
                nameLength = name.length();
                longestName = name;
            }
         index+=1;   
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+sum/(index*1.0));


    }
}
