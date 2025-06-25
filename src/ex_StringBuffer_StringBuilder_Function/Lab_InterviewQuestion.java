package ex_StringBuffer_StringBuilder_Function;

import java.util.Scanner;

public class Lab_InterviewQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :: ");
        String input = sc.next();

        String newStringreverse = reverseStringBuilder(input);
        if(newStringreverse.equalsIgnoreCase(input)){
            System.out.println(" this is palandoram  ");
        }
        else {
            System.out.println("this is not palindorem");
        }
    }

    static String reverseString(String userInput){
        String reversed ="";
        for (int i = userInput.length()-1 ; i>=0;i--){
            reversed = reversed + userInput.charAt(i);
        }
        return reversed;
    }

    static String reverseStringBuilder(String userInput){
        StringBuilder st = new StringBuilder(userInput);
        return st.reverse().toString();
    }
}
