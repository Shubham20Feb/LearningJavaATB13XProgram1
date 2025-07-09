package ex_23_Wrapper_Class;

public class Lab_03_Wrrapper_Conversion {

    public static void main(String[] args) {

        int a = 10 ;
        Integer b = a; // this is Boxing -->automatically JVM will store the value
        //primitive to wrapper conversion is call --> AutoBoxing
        System.out.println(b.intValue()); // Behaviour
        System.out.println(Integer.MIN_VALUE);// Behaviour

        Integer a2 = 43 ;
        int v = a2; // Unboxing --> Wrapper is removed , behaviour is removed
        System.out.println(v);

    }
}
