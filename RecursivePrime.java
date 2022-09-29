
import java.util.Scanner;

public class RecursivePrime {
    static boolean checkPrime(int number,int index){
        if(number == 2){
            return true;
        }

        else if(number % index==0){
            return false;
        }
        else if(index*index>number){
            return true;
        }
        return checkPrime(number,index+1);
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true){
            System.out.print("Enter number: ");
            int number=scan .nextInt();
            if(checkPrime(number,2)){
                System.out.println(number+" is a prime number!");
                System.out.println("----------------------------------");
            }else{
                System.out.println(number+" is not a prime number!");
                System.out.println("----------------------------------");
            }
        }
    }
}