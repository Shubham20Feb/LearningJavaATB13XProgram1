package ex_24_Exceptions;

public class Lab_18_Throw_Only_NotThrows {
    public static void main(String[] args) {

    }

    static void divideByZero(int a){
        if (a==0){
            throw new ArithmeticException("Erroe a===0");
        }
    }
}
