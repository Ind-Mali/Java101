import java.util.Scanner;

/**
 * exponentialnumber
 */
public class exponentialnumber {
    public static void main(String[] args) {
        int n, k, total = 1;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Which number do you want to do: ");
            n = inp.nextInt();

            System.out.print("Please enter your expanontial number: ");
            k = inp.nextInt();
        }

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(n + "^" + k + ": " + total);
    }
}