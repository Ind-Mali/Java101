import java.util.Scanner;

public class gradecalculate {
    public static void main(String[] args) {
        // create a variable
        double mat, physics, chemistry, geo, art,mean;
        double total = 0.0;
        double count = 0.0;
        // Take the value from keybord

        Scanner inp = new Scanner(System.in);
        

        System.out.print("Please enter your math grade: ");
        mat = inp.nextDouble();

        System.out.print("Please enter your physics grade: ");
        physics = inp.nextDouble();

        System.out.print("Please enter your chemistry grade: ");
        chemistry = inp.nextDouble();

        System.out.print("Please enter your geo grade: ");
        geo = inp.nextDouble();

        System.out.print("Please enter your art grade: ");
        art = inp.nextDouble();

        if ((mat >= 0) && (mat <= 100)) {
            total += mat;
            count++;
        }else{
            count++;
        }
        if ((physics >= 0) && (physics <= 100)) {
            total += physics;
            count++;
        }else{
            count++;
        }
        if ((chemistry >= 0) && (chemistry <= 100)) {
            total += chemistry;
            count++;
        }else{
            count++;
        }
        if ((geo >= 0) && (geo <= 100)) {
            total += geo;
            count++;
        }else{
            count++;
        }
        if ((art >= 0) && (art <= 100)) {
            total += art;
            count++;
            mean = (total/count);
            if(mean >= 55){
                System.out.println("Your mean is: "+ mean);
                System.out.println("Your grade is high---> Passed:)");
            }else{
                System.out.println("Your mean is: "+ mean);
                System.out.println("Your grade is low ---> Failed:(");
            }
        }else{
            count++;
            mean = (total/count);
            if(mean >= 55){
                System.out.println("Your mean is: "+ mean);
                System.out.println("Your grade is high---> Passed:)");
            }else{
                System.out.println("Your mean is: "+ mean);
                System.out.println("Your grade is low ---> Failed:(");
            }
        }
    }

}
