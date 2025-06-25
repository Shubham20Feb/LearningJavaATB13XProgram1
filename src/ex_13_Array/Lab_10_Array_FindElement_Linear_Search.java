package ex_13_Array;

public class Lab_10_Array_FindElement_Linear_Search {
    public static void main(String[] args) {
        int[] no = {12,22,45,65,10,76};
        // Find the elemet of the array
        int find = 65;
        //Find the index of the array
        for (int i=0;i<no.length;i++){
            if(find==no[i]){
                System.out.println(i);
            }
        }
    }
}
