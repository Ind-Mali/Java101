import java.util.Scanner;

public class findnumber {
    public static void main(String[] args) {
        int n, k, minNumber = 1, maxNumber = 1;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("How many number do you want to enter: ");
            n = scan.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". enter your number: ");
                k = scan.nextInt();
                if (i == 1) {
                    minNumber = k;
                    maxNumber = k;
                }
                if (k > maxNumber) {
                    maxNumber = k;
                }
                if (k < minNumber) {
                    minNumber = k;
                }
            }
        }
        System.out.println("Max number is: " + maxNumber + "\nMin number is: " + minNumber);
    }
}
