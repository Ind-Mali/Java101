import java.util.Scanner;

public class meanvalue {
    public static void main(String[] args) {
        int k, c= 0, i= 0,sum =0;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Please enter number: ");
            k = inp.nextInt();
        }

        for (i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum +=i;
                c ++;
            }
        }
        System.out.print("Mean of the value which are typed from keyboard is: "+sum/c);
    }
    
}
