import java.util.Scanner;

public class PatternwithNumbers {

    public static void desen(int number, int tempNumber, int x) {

        if (number > 0 && x == 0) {
            System.out.print(number + " ");
            number -= 5;
            desen(number, tempNumber, 0);
        }

        else if (number == 0 || number < 0) {
            System.out.print(number + " ");
            number += 5;
            desen(number, tempNumber, 1);
        }

        else if (number > 0 && number <= tempNumber && x == 1) {
            System.out.print(number + " ");
            number += 5;
            desen(number, tempNumber, 1);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        num = input.nextInt();

        desen(num, num, 0);
    }
}