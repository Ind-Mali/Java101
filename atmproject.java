import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class atmproject {
    public static void main(String[] args) {
        int right = 3;
        int select, prize;
        int balance = 1000;
        String userName, password;

        try (Scanner scan = new Scanner(System.in)) {
            while (right > 0) {
                System.out.print("Please enter your username: ");
                userName = scan.nextLine();
                System.out.print("Please enter your password: ");
                password = scan.nextLine();

                if (userName.equals("patika") && (password.equals("java123"))) {
                    System.out.println("Welcome..");
                    System.out.println("Process\t\t\tCode" +
                            "\n----\t\t\t----" +
                            "\nWithdraw\t\t1" +
                            "\nBalance\t\t\t2" +
                            "\nDeposi\t\t\t3" +
                            "\nExit\t\t\t4");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("How much dollars do you want to deposit: ");
                            prize = scan.nextInt();
                            if (balance > prize) {
                                balance -= prize;
                                System.out.println("Your balance is: " + balance);
                            } else {
                                System.out.println("Your money is not enough.");
                            }
                            break;
                        case 2:
                            System.out.println("Your balance is: " + balance);
                            break;
                        case 3:
                            System.out.print("How many dollars want to deposit: ");
                            prize = scan.nextInt();
                            balance += prize;
                            System.out.println("Your current balance is: " + balance);
                            break;
                        case 4:
                            System.out.println("Your simulation is finish.");
                            System.exit(0);
                            break;

                        default:
                            break;
                    }
                } else {
                    System.out.println("Your user name and password is not valid.");
                    right--;
                }
            }
            System.out.println("You tried 3 times wrong user name or password.");
            System.out.println("Please contact your bank");
        }
    }
}
