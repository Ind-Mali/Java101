
public class HarmonicNumber {

    static double harmonicnumber(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (1/arr[i]);
        }
        return sum/arr.length;
    }


    public static void main(String[] args) {
     int[] listNumber = {1,2,3,4,5,6,7};
     System.out.println(harmonicnumber(listNumber));
    }   
}
