import java.util.Scanner;

public class AdvanceCalculate {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int counter, number, result = 0, i = 1;
        System.out.print("How many number do you want to sum: ");
        counter = scan.nextInt();

        while (counter >= i) {
            System.out.print(i++ + ". number : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Your result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        int result = a - b;
        System.out.println("Your result is: " + result);

    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int counter, number, result = 1, i = 1;
        System.out.print("How many numbers do you want to multiply: ");
        counter = scan.nextInt();

        while (counter >= i) {
            System.out.print(i++ + ". number : ");
            number = scan.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Your result is: " + result);
    }

    static void divided() {
        double divided, divisor;
        double result;
        Scanner scan = new Scanner(System.in);
        boolean isTrue = true;
        System.out.print("Enter the first number: ");
        divided = scan.nextInt();
        System.out.print("Enter the second number: ");
        divisor = scan.nextInt();
        while (isTrue) {
            if (divisor == 0) {
                System.out.println("Your divisor should not be zero!!");
                isTrue = false;
            }
            result = divided / divisor;
            System.out.println("Your result is: " + result);
            isTrue = false;
        }
    }

    static void exp() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = scan.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + "^" + exponent + " = " + result);
    }

    static void fac() {
        int facnumber;
        long result = 1;
        boolean isTrue = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("Which number do you want to take factorial: ");
        facnumber = scan.nextInt();

        while (isTrue) {
            if (facnumber < 0) {
                System.out.println("Number must be higher then zero!!!");
                isTrue = false;
            } else if (facnumber > 20) {
                System.out.println("Factorial number must be less then 20!!!");
                isTrue = false;
            } else {
                for (int i = 1; i <= facnumber; i++) {
                    result *= i;
                }
                System.out.println(facnumber + "!" + " = " + result);
                isTrue = false;
            }
        }
    }

    static void mod() {
        int number, result, modNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Which number do you want to take mod: ");
        number = scan.nextInt();
        System.out.print("By what number will you get mod: ");
        modNumber = scan.nextInt();
        result = number % modNumber;
        System.out.println(number + " % " + modNumber + " : " + result);
    }

    static void rectangle() {
        double longEdge, shortEdge, resultArea, resultPerimeter;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the long edge: ");
        longEdge = scan.nextInt();
        System.out.print("Enter the short edge: ");
        shortEdge = scan.nextDouble();

        if (longEdge == 0 || shortEdge == 0) {
            System.out.println("You must be enter a number except zero!!");
        } else {
            resultArea = longEdge * shortEdge;
            resultPerimeter = 2 * (longEdge + shortEdge);
            System.out
                    .println("Perimeter of rectangle is: " + resultPerimeter + "\nArea of rectange is: " + resultArea);
        }
    }

    public static void main(String[] args) {
        int select;
        Scanner scan = new Scanner(System.in);

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Exit";

        System.out.println(menu);
        while (true) {
            System.out.print("Enter from the menu: ");
            select = scan.nextInt();

            if (select == 0)
                break;
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    exp();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;

                default:
                    break;
            }

        }
    }
}