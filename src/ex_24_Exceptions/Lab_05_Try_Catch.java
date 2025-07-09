package ex_24_Exceptions;

public class Lab_05_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException y){
            System.out.println(y.getMessage());
            System.out.println("Are you fool");
        }
        System.out.println("2");

    }
}
