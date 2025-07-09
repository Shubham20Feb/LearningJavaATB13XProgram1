package ex_24_Exceptions;

public class Lab_06_Multi_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException y){
            System.out.println(y.getMessage());
            System.out.println("Are you fool");
        }catch (Exception u){
            System.out.println(u.getMessage());
            System.out.println("Are you fool too");
        }
        System.out.println("2");

    }
}
