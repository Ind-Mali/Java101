import java.util.Scanner;

public class PalindromMethot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = scan.nextInt();
        System.out.println("If this number is palindrome then throw the True else False ==> "+isPalindrom(number));
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
}
