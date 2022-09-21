import java.util.Scanner;
public class uppertriangel {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many stars row do you want: ");
        n = scan.nextInt();

        for (int i = n - 1; i > 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
