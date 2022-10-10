import java.util.Scanner;

public class PalindromicWords {

    static boolean isPalindromic(String str){
        int i = 0;
        int j = str.length() -1;
        while( i < j){
            if((str.charAt(i) != str.charAt(j)) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = scan.nextLine();
        System.out.println(isPalindromic(str));
        
        
    }
}