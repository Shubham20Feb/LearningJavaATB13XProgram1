package ex_13_Array;

public class Lab_15_2D_Array_Iteration_ForLoop {
    public static void main(String[] args) {
        // Matrix is called when roow and coloum are equal
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // 3*3
        //Row - 3
        //Coloum-3
        //1,2,3
        //4,5,6
        //7,8,9
        System.out.println(matrix.length);

        for (int i = 0;i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length; j++){

                System.out.print(matrix[i][j] + "  | ");
               // System.out.print("*");
            }
            System.out.println();
        }


    }
}
