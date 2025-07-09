package ex_24_Exceptions;

public class Lab_10_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        int c = 0;
        try {
            c = 10 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" i will be allways executed ");
        }
    }
}
