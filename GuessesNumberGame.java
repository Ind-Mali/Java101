import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * GuessesNumberGame
 */
public class GuessesNumberGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);


        int right = 0;

        int selected;
        int[] wrongNumber = new int[5];
        while (right < 5) {
            System.out.print("Enter the you guess number: ");
            selected = scan.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter the number between 0 to 100!!");
                continue;
            }
            if (selected == number) {
                System.out.println("You selected right number, You Won :)");
                break;
            } else {
                wrongNumber[right] = selected;

                System.out.println("Wrong number!!! :(");
                if (selected < number) {
                    System.out.println("You must enter a higher number: " + selected);
                } else {
                    System.out.println("You must enter a smaller number: " + selected);
                }
                System.out.println("You can try " + (5 - ++right)+ " times");
                System.out.println("Your wrong number is: " + Arrays.toString(wrongNumber));
                System.out.println("========================");
            }
        }System.out.println("The number was: " + number);
        System.out.println("You losed :(");
    }
}