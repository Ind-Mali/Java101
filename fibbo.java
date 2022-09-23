import java.util.Scanner;


public class fibbo {
    public static void main(String[] args) {
        int n,k=1,m=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many number do you want to find as a fibonacci series: ");
        n = scan.nextInt();
        System.out.print(k+"-");
        System.out.print(m+"-");

        for (int i = 1; i < n-1; i++) {
            int c = m+k;
            m = k;
            k = c;
            System.out.print(c+"-");
        }
    }
}
