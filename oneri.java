import java.util.Scanner;

public class oneri {
    public static void main(String[] args) {
        // Create variable
        double heat;

        // Take the value from keybord
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the weather(C): ");
        heat = inp.nextDouble();

        if(heat < 5){
            System.out.println("You can go to ski");
        }else if((heat >= 5) && (heat < 15)){
            System.out.println("You can go to cinema");
        }else if((heat >= 15) && (heat < 25)){
            System.out.println("You can go picnic");
        }else{
            System.out.println("You can go swim");
        }
    }
}
