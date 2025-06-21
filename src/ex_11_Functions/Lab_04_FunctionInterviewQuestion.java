package ex_11_Functions;

import java.util.Scanner;

public class Lab_04_FunctionInterviewQuestion {
    public static void main(String[] args) {
        // create a fun of add , sub , multi and divide
        // Take input as a and b from user
        // handel the edge case
        //1 if user enter the string not int
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no 1 ");
        int a = 0;
        // edge case handling
        if(scanner.hasNextInt()){
            a=scanner.nextInt();
        }else {
            System.out.println("Enter the integer only !!!!");
            System.exit(0);
        }


        System.out.println("Enter the no 2 ");
        int b = 0;
        // edge case handling
        if (scanner.hasNextInt()){
            b= scanner.nextInt();
        }else {
            System.out.println("Enter the integer only ");
            System.exit(0);
        }

       // method 1 sum
       int sum = sum_of_twono(a,b);
       System.out.println("sum " + sum);
       // method 2 subtract
        int sub = sub_of_twono(a,b);
        System.out.println("sub " + sub);
        // Methos 3 multiply
        int mult = multi_of_twono(a,b);
        System.out.println("Multiply " + mult);
        // method 4 divide
        int divide = div_of_twono(a,b);
        System.out.println("divide  " + divide );
        /*
        System.out.println("sum " + sum);
        System.out.println("sub " + sub);
        System.out.println("Multiply " + mult);
        System.out.println("divide  " + divide );*/


    }
    static int sum_of_twono(int a , int b){
        return a+b;
    }
    static int sub_of_twono(int a, int b){
        return a-b;
    }
    static int multi_of_twono(int a, int b){
        return a*b;
    }
    static int div_of_twono(int a , int b){
        // edge case handling
        if (b==0){
            //System.out.println("b can't be zero");
           // System.exit(0);
            throw new ArithmeticException("b can't be zero");
        }
        return a / b;
    }
}
