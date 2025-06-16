package ex_06_Increment_Decrement;

public class Lab_02_Increment_Op {
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println(++a);
        System.out.println(a);

        // Exp result table
        // line  // a  // result
        // 5    // 10 // na
        // 6  // 11// 11
        // 7  // 11 // 11

        // Post increse -- print first then increse
        int a_incre  = 11;
        System.out.println(a_incre++);
        System.out.println(a_incre);;


        //line     // a_inc // result
        // 16     // 11     // 11
        // 17    // 11     // 12
        //18     // 18 // 18
    }
}
