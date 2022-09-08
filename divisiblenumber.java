import java.util.Scanner;
public class divisiblenumber {
    public static void main(String[] args) {
        int n, sum=0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("If you enter a number which is divisible 2 and 4 you can get the total number of them.");
            System.out.println("If you enter the odd number the app will shut down");
            do {
                System.out.print("Please enter number: ");
                n = scan.nextInt();
                if ((n % 2 == 0) && (n % 4 == 0)) {
                    sum += n;
                    
                }
            } while (n % 2 == 0);
        }System.out.println("Sum all the number which are divisible 2 and 4: "+sum);
    }
}
