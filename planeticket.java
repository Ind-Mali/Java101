import java.util.Scanner;

public class planeticket {

    public static void main(String[] args) {
        // create variables
        double km, roundTripDiscount, ageDiscount, cost;
        int age, trip;

        // take the value from keybord

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter distance as KM: ");
        km = inp.nextDouble();

        System.out.print("Please enter age: ");
        age = inp.nextInt();

        System.out.print("Please enter trip(One Way =>1 ,Round Trip => 2): ");
        trip = inp.nextInt();

        cost = 0.0;
        cost = km * 0.10;

        if ((trip == 1) || (trip == 2)) {
            if (trip == 1) {
                if ((age >= 1) && (age < 12)) {
                    ageDiscount = cost * 0.5;
                    cost -= ageDiscount;
                } else if ((age >= 12) && (age <= 24)) {
                    ageDiscount = cost * 0.1;
                    cost -= ageDiscount;
                } else if ((age >= 65)) {
                    ageDiscount = cost * 0.3;
                    cost -= ageDiscount;
                }
                System.out.println("Total Cost is: " + cost + " TL");
            } else {
                if ((age >= 1) && (age < 12)) {
                    ageDiscount = cost * 0.5;
                    cost -= ageDiscount;
                } else if ((age >= 12) && (age <= 24)) {
                    ageDiscount = cost * 0.1;
                    cost -= ageDiscount;
                } else if ((age >= 65)) {
                    ageDiscount = cost * 0.3;
                    cost -= ageDiscount;
                }
                roundTripDiscount = cost * 0.2;
                System.out.println("Total cost is: " + ((cost - roundTripDiscount) * 2) + " TL");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
