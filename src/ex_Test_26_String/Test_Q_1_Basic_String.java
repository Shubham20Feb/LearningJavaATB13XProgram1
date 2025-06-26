package ex_Test_26_String;

import java.sql.SQLOutput;

public class Test_Q_1_Basic_String {
    public static void main(String[] args) {
        String s1 = "Hello";


        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.concat(" World"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(1,4));

    }
}
