package ex_04_TernaryOperation;

public class Lab_05_TernaryEveen {
    public static void main(String[] args) {
        // Even no
         int num = 10 ;
         String Resutl = (num%2==0)?"Even" : "Odd";
        System.out.println(Resutl);

        // Odd no
        int num1 = 12 ;
        String Result = (num1%2!=0)?"Odd": "Even";
        System.out.println(Result);
    }
}
