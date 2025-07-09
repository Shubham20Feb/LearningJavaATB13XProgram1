package ex_24_Exceptions;

public class Lab_07_Try_Catch {
    public static void main(String[] args) {
       // We can combine the exception in the try block
        String s11 = null;
        try {
            s11.trim();
            int a = 10 / 0;
        } catch (ArithmeticException | NullPointerException u) {
            System.out.println(u.getMessage());
            System.out.println("Null or Arth Error");
        }
        catch (Exception J) {
            System.out.println(J.getMessage());
        }

        System.out.println("end ///");
    }
}
