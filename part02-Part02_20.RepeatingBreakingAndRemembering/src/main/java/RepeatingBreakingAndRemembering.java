
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum  = 0;
        int number = 0;
        int countEven = 0;
        int countOdd = 0;
        System.out.println("Give numbers:");
        while(true){
            int userInput = scanner.nextInt();
            if(userInput == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            if ( userInput % 2 == 0) {
                countEven += 1;
            } else {
                countOdd += 1;
            }
            sum+=userInput;
            number+=1;
        }
        double average = sum/(number*1.0);
        System.out.println(String.format("Sum: %d", sum));
        System.out.println("Numbers: " + number);
        System.out.println("Average: " + average);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}