import java.util.Scanner;

public class percomfak {
    public static void main(String[] args) {
        int n, r;
        double combination;
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("C(n,r) = n! / (r! * (n-r)!)");
            System.out.print("Please enter n number: ");
            n = inp.nextInt();
            System.out.print("Please enter r number: ");
            r = inp.nextInt();
        }

        if (n < r) {
            System.out.println("Your value is not true!");
            System.exit(0);
        }
        combination = (factorial(n)) / (factorial(r) * factorial(n - r));
        System.out.println("C("+n+","+r+")"+":"+(int)combination);
    }

    static double factorial(int number) {
        if (number < 0 || number > 20) {
            return -1;
        }else if(number == 0){
            return 1;
        }
        else {return (number * factorial(number - 1));}
    }
}
