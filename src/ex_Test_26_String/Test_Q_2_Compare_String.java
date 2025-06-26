package ex_Test_26_String;

public class Test_Q_2_Compare_String {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = new String("heLLo");

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));

    }
}
