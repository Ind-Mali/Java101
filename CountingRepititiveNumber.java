import java.util.Arrays;

public class CountingRepititiveNumber {


    static boolean ignore(int[] arr, int number, int b){
        for (int i = 0; i < b; i++) {
            if(number == arr[i]){
               return false; 
            }
        }
        return true;
    }
    
    static int equalCount(int[] arr, int number){
        int count = 0;
        for (int i : arr) {
            if(i == number){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,3,1,5,1,5,10,11,10,12,11,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            if(ignore(arr, arr[i], i)){
                System.out.println(equalCount(arr, arr[i]) + " times counting this number: " + arr[i] );
            }
        }
    }
}
