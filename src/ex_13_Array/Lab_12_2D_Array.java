package ex_13_Array;

public class Lab_12_2D_Array {
    public static void main(String[] args) {
        //1,2,3
        //4,5,6
        //7,8,9

        int [][]  array2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //1,2
        //2.3
        //4,5
        int [][] array;
        array = new int[][]{
                {1,2},
                {3,4},
                {4,5}
        };
        // Creating empaty array
        int[][] array1 = new int[3][3];
        array1[0][0]=1;
        array1[0][1]=2;
        array1[0][2]=3;
        array1[1][0]=4;
        array1[1][1]=5;
        array1[1][2]=6;
       // array1[1][3]=2; will through out of box exception

    }
}
