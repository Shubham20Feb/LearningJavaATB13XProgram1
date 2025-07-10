package ex_25_Generics;

public class Lab_02_Generic_Fix {
    public static void main(String[] args) {
        display(4, 7);
        display(8.90, 65.90);
        display("shubham", "raj");

    }

    // T - template
    static <T> void display(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }
    // if the function is returing any thing the we need to handle thta

    static <T> T display(T a, T b, T V) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
