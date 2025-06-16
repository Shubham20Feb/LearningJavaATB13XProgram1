package ex_03_TypeCasting;

public class Lab_04_TypeCasteing {
    public static void main(String[] args) {
         long  phone  = 98765432101L ;
         //short s = phone ; // Implicite Narrow not allowed
        short s = (short)phone;  // Explicit narrowing
        System.out.println( s);



    }
}
