import java.util.Arrays;

import javax.swing.text.html.FormView;

public class RepetitiveNumber {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 4, 22, 12, 12, 22 };
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(duplicate));
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
                
            }
        }
    }
}