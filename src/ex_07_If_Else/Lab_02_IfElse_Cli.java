package ex_07_If_Else;

public class Lab_02_IfElse_Cli {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 18 ){
            System.out.println("Alowed to vote ");
        }
        else{
            System.out.println("Not allowed to vote ");
        }
    }
}
