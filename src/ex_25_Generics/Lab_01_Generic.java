package ex_25_Generics;

public class Lab_01_Generic {
    public static void main(String[] args) {
         tem_sum(4,9);
         tem_sum(6.87, 9.76);
         tem_sum("Shubham", "Raj");

    }


    static int tem_sum(int a, int b ){
        return a+b;


    }
    static double tem_sum(double a , double b){
        return a+b;

    }
    static String tem_sum(String a , String b){
        return a+b;
    }
}
