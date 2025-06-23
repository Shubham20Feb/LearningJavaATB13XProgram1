package ex_12_Task23Day;

import java.util.Scanner;

public class Lab_Negative_0r_Postive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:: ");
        Double num = sc.nextDouble();
             if(num > 0){
                 System.out.println("this positve no  : " + num);
             }else if(num < 0 ) {
                 System.out.println(" No is not positive no :: " + num);
             }
             else{
            System.out.println(" the no is zero  ::" + num );
        }
         }
    }
