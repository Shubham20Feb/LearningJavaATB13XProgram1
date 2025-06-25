package ex_StringBuffer_StringBuilder_Function;

public class Lab_02_StringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
        str.append("World");
        System.out.println(str);

        // Reverse also
        System.out.println(str.reverse());
        String s1 = "shubham"; // 1st string
        String s2 = "Raj";  // 2nd string
        String s3 = s1+s2; // this will create the 3rd string
        System.out.println(s3);// outpot shubhamraj
        System.out.println(s1); // shubham

    }
}
