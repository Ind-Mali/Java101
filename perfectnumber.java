import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Which number do you want to look: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (total == n) {
            System.out.println("This number is perfect number.");
        } else {
            System.out.println("This number is not perfect number.,");
        }
    }
}