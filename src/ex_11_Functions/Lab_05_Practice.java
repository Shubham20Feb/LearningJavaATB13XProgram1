package ex_11_Functions;

import javax.xml.namespace.QName;

public class Lab_05_Practice {
    public static void main(String[] args){
        // Type 4 // Calling of function
        int sum = sum_of_twono(6,9);
        System.out.println(sum);
        //type 3
        with_Paramater_withoutreturn("shubham", 23, 7788);
        //type 2
        String name = with_returntype();
        System.out.println(name);
        //type1
        without_wr_without_argument();



    }
    // defining the function
    //type 4 with parameter and with return type
    static int sum_of_twono(int a,int b){
        System.out.println("Type 4---");
        return a+b;
    }
    // type 3 with parameter without return type
    static void with_Paramater_withoutreturn( String name,int age,float salary){
        System.out.println("type 3-");
        System.out.println(" yourname " + name+ " your age " + age + " Your salary " + salary);

    }
    //type 2 without parameter with return type
    static String with_returntype(){
        System.out.println("type 2");
        return "shubham";
    }
    //type 1
    static void without_wr_without_argument(){
        System.out.println("type 1");
    }
}
