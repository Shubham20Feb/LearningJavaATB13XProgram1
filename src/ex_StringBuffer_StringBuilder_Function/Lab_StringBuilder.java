package ex_StringBuffer_StringBuilder_Function;

public class Lab_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.replace(0,4,"c++");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
