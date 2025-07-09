package ex_24_Exceptions;

public class Lab_09_Try_Catch {
    public static void main(String[] args) {

        int q = 0;
        int c = 0;
        try {
            int b = 10 / c;  // Only vulnerable code that should be in the try and catch block
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        // If i dont know the exception the we need to add one big basket exception
        catch (Exception t){
            System.out.println(t.getMessage());
        }

    }
}
