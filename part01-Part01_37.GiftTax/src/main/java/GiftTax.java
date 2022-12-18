
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (5_000 <= gift && gift <= 25_000) {
            int lowerLimit = 100;
            double taxRate = 0.08;
            double giftTax = lowerLimit + (gift - 5000) * taxRate;
            System.out.println(String.format("Tax: %s", giftTax));
        } else if (25_000 <= gift && gift <= 55_000) {
            int lowerLimit = 1_700;
            double taxRate = 0.10;
            double giftTax = lowerLimit + (gift - 25_000) * taxRate;
            System.out.println(String.format("Tax: %s", giftTax));
        } else if (55_000 <= gift && gift <= 200_000) {
            int lowerLimit = 4_700;
            double taxRate = 0.12;
            double giftTax = lowerLimit + (gift - 55_000) * taxRate;
            System.out.println(String.format("Tax: %s", giftTax));
        } else if (200_000 <= gift && gift <= 1_000_000) {
            int lowerLimit = 22_100;
            double taxRate = 0.15;
            double giftTax = lowerLimit + (gift - 200_000) * taxRate;
            System.out.println(String.format("Tax: %s", giftTax));
        } else if (gift >= 1_000_000) {
            int lowerLimit = 142_100;
            double taxRate = 0.17;
            double giftTax = lowerLimit + (gift - 1_000_000) * taxRate;
            System.out.println(String.format("Tax: %s", giftTax));
        }

    }
}
