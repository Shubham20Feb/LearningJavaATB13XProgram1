package ex_StringBuffer_StringBuilder_Function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_InterviewVobelandConst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the comadan:: ");
        String input = sc.next();
        input = input.toLowerCase();
        char chara = input.charAt(2);
        System.out.println(chara);
        System.out.println(input);
        int vol = 0 ;
        int cons = 0;

        for (int i = 0; i<input.length();i++){
            char ch = input.charAt(i);
            if ( ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
                vol++;
            }
            else {
                cons++;
            }
        }
        System.out.println("Voble :: " + vol);
        System.out.println("Cons :: " + cons);
    }
}
