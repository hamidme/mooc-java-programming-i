
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            
            if(input == -1) {
                break;
            }
            list.add(input);
        }
        
        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        int sum = 0;
        int n = list.size();
        for(int i = 0; i < n; i++){
            sum+=list.get(i);
            
        }
        double average = sum / (n*1.0);
        System.out.println("Agerage: "+average);
    }
}
