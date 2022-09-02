import java.net.SocketTimeoutException;
import java.util.Scanner;

public class userapp {
    public static void main(String[] args) {
        // Create variable
        String user, password, newPassword, answer;

        // Take the value of user
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your user name: ");
        user = inp.nextLine();
        System.out.print("Enter your password: ");
        password = inp.nextLine();

        if (user.equals("patika") && password.equals("java101")) {
            System.out.println("Successful! You are in");
        } else if (!user.equals("patika") || password.equals("java101")) {
            System.out.println("Your user name is not valid. Please re-enter valid user name");
        } else if (user.equals("patika") || !password.equals("java101")) {
            System.out.println("Your password is not valid!!!");
            System.out.print("Dou you want to create new password --> 'y/n': ");
            Scanner scan = new Scanner(System.in);
            answer = scan.nextLine();
            if (answer.equals("n") || answer.equals("N")) {
                System.out.println("The system is closing\n....................");
            } else if (answer.equals("y") || answer.equals("Y")) {
                System.out.print("Type your new password: ");
                newPassword = scan.nextLine();
                if (newPassword.equals("java101")) {
                    System.out.println("New password can not be the same previous password!");
                } else {
                    password = newPassword;
                    System.out.println("Successful, You changed your password");
                }
            }
        }
    }
}
