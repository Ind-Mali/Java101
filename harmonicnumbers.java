import java.util.Scanner;

public class harmonicnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number that how many number do you want to find as a harmonic number: ");
        int n = scan.nextInt();
        double hM = 0;
        for (double i = 1; i < n; i++) {
            hM += (1/i);
        }System.out.println(hM);
    }
}
