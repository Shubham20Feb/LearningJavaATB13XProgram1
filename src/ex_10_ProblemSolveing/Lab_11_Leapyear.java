package ex_10_ProblemSolveing;

import java.util.Scanner;

public class Lab_11_Leapyear {
    public static void main(String[] args) {
        // leap year //366 day // feb = 29//
        // leap % 4 and %400
        // but not by %100
        Scanner sc = new Scanner(System.in);
        System.out.println ("Ente the year  ::  "  );
        int year = sc.nextInt();
        System.out.println("The year entered is  : "+ year);
        if( (year %  4 == 0  && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("This is the leap year entered  :" + year);
        }
        else {
            System.out.println("This is is not a leap year  :" + year);
        }



    }
}
