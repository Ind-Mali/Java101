import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        // create the variable
        int a,b,c;

        // take the value from keybord
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        a = inp.nextInt();

        System.out.print("Please enter second number: ");
        b = inp.nextInt();

        System.out.print("Please enter third number: ");
        c = inp.nextInt();

        if((a < b)&&(a < c)){
            if(b < c ){
                System.out.print("a < b < c");
            }else{
                System.out.print("a < c < b");
            }
        }else if(( b < a )&&( b < c )){
            if( a < c){
                System.out.print("b < a < c");
            }else{
                System.out.print("b < c < a");
            }
        }else if((c < a) && (c < b)){
            if( a < b){
                System.out.print("c < a < b");
            }else{
                System.out.print("c < b < a");
            }
        }else{
            System.out.println("a = b = c");
        }
    }
}
