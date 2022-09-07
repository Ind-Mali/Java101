import java.util.Scanner;

public class cinzodyak {
    public static void main(String[] args) {
        // Create the variables
        int num, birthDay, realDivide = 12;

        // take the value from keybboard

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Please enter your birthday like this (1991): ");
            birthDay = inp.nextInt();
        }

        // We find the remainder from this operator (%)
        num = (birthDay % realDivide);

        switch (num) {
            case 0:
                System.out.print("Your chinese zodiac birthday is: Monkey");
                break;

            case 1:
                System.out.print("Your chinese zodiac birthday is: Rooster");
                break;

            case 2:
                System.out.print("Your chinese zodiac birthday is: Dog");
                break;
                
            case 3:
                System.out.print("Your chinese zodiac birthday is: Pig");
                break;

            case 4:
                System.out.print("Your chinese zodiac birthday is: Rat");
                break;

            case 5:
                System.out.print("Your chinese zodiac birthday is: Ox");
                break;

            case 6:
                System.out.print("Your chinese zodiac birthday is: Tiger");
                break;

            case 7:
                System.out.print("Your chinese zodiac birthday is: Rabbit");
                break;

            case 8:
                System.out.print("Your chinese zodiac birthday is: Dragon");
                break;

            case 9:
                System.out.print("Your chinese zodiac birthday is: Snake");
                break;

            case 10:
                System.out.print("Your chinese zodiac birthday is: Horse");
                break;

            case 11:
                System.out.print("Your chinese zodiac birthday is: Goat");
                break;

            default:
                System.out.println("You make some mistakes please restart this app");
                break;
        }

    }
}
