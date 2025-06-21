package ex_11_Functions;

public class Lab_03_UserDefineFunction {
    public static void main (String[] args){

        int result = sum_of_twono(3,4);
        sum_of_twono_notreturn(9, 9);
        System.out.println(result);
    }
    static int sum_of_twono(int a , int b){
        return a+b;
    }
    static void sum_of_twono_notreturn(int c , int d ){
        //return a + b; can return the value because it is void functio
        System.out.println(c+d);
    }
}
