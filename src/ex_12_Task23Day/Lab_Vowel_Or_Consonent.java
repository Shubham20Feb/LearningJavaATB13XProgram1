package ex_12_Task23Day;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_Vowel_Or_Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the char ");
        Character ch = sc.next().toLowerCase().charAt(1);

        if(ch == 'a'||ch== 'e'|| ch=='i'||ch=='o'||ch=='u'){
            System.out.println("The char is vouble ::"  + ch );
        }else {
            System.out.println("the char is not voble  :: " + ch);
        }
    }
}
