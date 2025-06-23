package ex_12_Task23Day;

import java.util.Scanner;

public class Lab_Largest_of_ThreeNo {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nem1 :: " );
    int num1 = sc.nextInt();
    System.out.println("Enter the seconf no :: ");
    int num2 = sc.nextInt();
    System.out.println("Enter the third no :: ");
    int num3 = sc.nextInt();


    if(num1 >= num3 && num1 >= num2){
        System.out.println(" Num1 is grester than Num 2  and num3:: " + num1);
    }
    else if(num2 >= num1 && num2 >= num3){
        System.out.println("Num2 is grester than Num 1  and num3:: " + num2);
    }
    else {
        System.out.println("Num2 is greater then num1 and num2 :: " + num3  );
    }
    sc.close();
}


}

