import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class leapyear {
    public static void main(String[] args) {
        //  create the variable
        int year, num1 = 100, num2 = 400, num3 = 4;

        // Take the year form keyboard

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Please enter the year which want to find leap year or not: ");
            year = inp.nextInt();
        }

        if( year % num1 == 0){
            if( year % num2 == 0){
                System.out.println(year + " is leap year.");
            }else{
                System.out.println(year + " is not lear year.");
            }
        }else if( year % num3 ==0){
            System.out.println(year + " is leap year.");
        }else{
            System.out.println(year + " is not leap year.");
        }
    }
}
