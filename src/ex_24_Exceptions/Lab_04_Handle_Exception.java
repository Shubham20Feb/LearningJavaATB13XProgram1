package ex_24_Exceptions;

public class Lab_04_Handle_Exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0; //java.lang.ArithmeticException: / by zero
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Div by zero not allowed ????");
        }
        System.out.println(a);

        ////checked -- Jvm
        //JVM knows about it , During compilation -- JVM is saying that
        //there can be case when this file is not found

        // JVM Knows that this may leads ti file not found exception
        //so it is telling to handle it
    }
}
