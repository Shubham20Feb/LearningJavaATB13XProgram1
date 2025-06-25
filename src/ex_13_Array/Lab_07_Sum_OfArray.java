package ex_13_Array;

public class Lab_07_Sum_OfArray {
    public static void main(String[] args) {
        int[] num = {12,34,76};
        // Sum of the array
        int sum = 0;
        for (int i = 0 ; i<num.length;i++){
            sum = sum + num[i];

        }
        System.out.println("sum of the arrays is " + sum );
    }
}
