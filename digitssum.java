import java.util.Scanner;

public class digitssum {
    public static void main(String[] args) {
        int a, b = 10, countNumber = 0, total = 0;
        int basvalue;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        a = scan.nextInt();
        int temNumber = a;

        while (temNumber != 0) {
            temNumber /= b;
            countNumber++;
        }
        System.out.println("Your number is " + countNumber + " digits");
        temNumber = a;
        while (temNumber != 0) {
            basvalue = temNumber % b;
            temNumber /= b;
            total += basvalue;
        }
        System.out.println("The sum of the digits of your number is: " + total);
    }
}
