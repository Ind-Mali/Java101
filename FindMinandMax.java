import java.util.Scanner;
import java.util.Arrays;

public class FindMinandMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, numberOfRange;

        System.out.print("How many number add your array: ");
        numberOfRange = scan.nextInt();
        int[] arr = new int[numberOfRange];

        System.out.println("Enter the number of arrays: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". digits: ");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Which number do you want to check: ");
        number = scan.nextInt();

        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            if (j < number) {
                min = j;
            }
            if (j > number) {
                max = j;
                break;
            }
        }

        System.out.println("The nearest number smaller than the entered number: " + min);
        System.out.println("The nearest number greater than the entered number: " + max);
        scan.close();
    }

}
