import java.util.Scanner;
import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfRange;

        System.out.print("How many number add your array: ");
        numberOfRange = scan.nextInt();
        int[] arr = new int[numberOfRange];

        System.out.println("Enter the number of arrays: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". digits: ");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    
    }
}