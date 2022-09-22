import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        // find the prime numbers
        int n, counter = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("In which range are you looking for prime numbers?\nPlease enter non-negatif number: ");
            n = scan.nextInt();
            if (n == 2) {
                System.out.println(n + " is the smallest prime number.");
            }
        } while (n < 2);

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    counter++;
            }
            if (counter == 0)
                System.out.println(i);
            counter = 0;
        }
    }
}
