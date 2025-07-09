package ex_24_Exceptions;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab_19_Throw_Only_NotThrows1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    static void validateAge(int age ) throws Exception {
        if(age < 18){
            throw new Exception("You cant go to Goa ");
        }
    }
}
