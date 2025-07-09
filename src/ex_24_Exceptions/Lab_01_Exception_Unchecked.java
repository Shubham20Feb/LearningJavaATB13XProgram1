package ex_24_Exceptions;

public class Lab_01_Exception_Unchecked {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user = args[0];// when we not enter any argument --> java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        Integer a = Integer.parseInt(input_user);  // When we enter alphabat --> java.lang.NumberFormatException: For input string: "raj"
        Integer output = 100 / a;  //// when we enter 0 --> java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("end of program");

        // when we enter 0 --> java.lang.ArithmeticException: / by zero
        // When we enter alphabat --> java.lang.NumberFormatException: For input string: "raj"
        // when we not enter any argument --> java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}
