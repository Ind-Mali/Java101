import java.util.Scanner;

public class RecrusiveExp {

    static int exp(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * exp(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = scan.nextInt();

        System.out.println(exp(base, exponent));
    }
}
