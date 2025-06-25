package ex_StringBuffer_StringBuilder_Function;

public class Lab_01_StringBilder_VS_Buffer {
    public static void main(String[] args) {
        // How to create a string
        String sh = "Raju";
        String s1 = new String("Shubham");
        // Below are mutable in nature
        StringBuffer stringbuffer = new StringBuffer("Hello");
        StringBuilder stringbuilder = new StringBuilder("World");

        System.out.println(sh);
        System.out.println(s1);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);
    }
}
