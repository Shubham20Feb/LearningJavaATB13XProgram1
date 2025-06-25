package ex_13_Array;

import java.util.Arrays;

public class Lab_01_MaxandMin {
    public static void main(String[] args) {

        // Array
        int[] markes = {10,12,13,67,78,98};// User difined arry
// To print the max
        // not good practice below code
       // Arrays.sort(markes);
       // System.out.println(markes[markes.length-1]);

        int max_output = max_of_arry(markes);
        System.out.println(max_output);

        // min
        int min_output = min_of_arry(markes);
        System.out.println(min_output);


    }

    static int max_of_arry(int[] markes ){
        int max = markes[0];
        for (int i = 0; i<markes.length; i++){
            if (markes[i]>max){
                max=markes[i];
            }
        }
        return max;
    }
    static int min_of_arry(int[] markes){
        int min = markes[0];
        for (int i = 0 ; i<markes.length;i++){
            if(markes[i]< min){
                min=markes[i];
            }
        }
        return min;

    }
}

