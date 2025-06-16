package ex_03_TypeCasting;

public class Lab_03_TypeCasteing {
    public static void main(String[] args) {
        int val = 300;
        //byte a = val ; // Narrowing (Int to byte ) -- implicate casteing is not allowed
        byte a1 = (byte) val; // Narrowing (Int to byte ) -- Wxplicateing  casteing is  allowed
        // Data losss
        System.out.println(a1);
    }
}
