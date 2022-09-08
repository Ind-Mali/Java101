
/**
 * multiples4and5
 */
import java.util.Scanner;

public class multiples4and5 {

    public static void main(String[] args) {
        int n;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter the max value: ");
            n = scan.nextInt();
        }
        System.out.println(".............Hesaplanıyor..........");

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("Numbers that are multiples of 4: " + i);
        }
        System.out.println("--------------------------------");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println("Numbers that are multiples of 5: " + i);
        }
    }
}