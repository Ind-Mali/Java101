import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        // create the variable
        int n1, n2, ebob = 1, ekok = 1;
        int i = 1, k = 1;
        boolean isTrue;

        // Take the variable from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        n1 = scan.nextInt();
        System.out.print("Please enter second number: ");
        n2 = scan.nextInt();

        if (n1 <= n2) {
            isTrue = true;
        } else {
            System.out.println("First number must be smaller then second number!!");
            isTrue = false;
        }

        while (isTrue) {

            while (i <= n1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }

            while (k <= (n1 * n2)) {
                if (k % n1 == 0 && k % n2 == 0) {
                    ekok = k;
                    break;
                }
                k++;
            }
            System.out.println("Ekok is: " + ekok + "\nEbob is: " + ebob);
            isTrue = false;
        }
    }
}
