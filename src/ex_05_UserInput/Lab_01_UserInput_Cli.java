package ex_05_UserInput;

public class Lab_01_UserInput_Cli {
    public static void main(String[] args) {

        String age_string = args[0];
        System.out.println(age_string);
        int  age1 = Integer.parseInt(age_string);
        String canIvote = age1 >= 18 ? "Yes" : "No";
        System.out.println(canIvote);
    }
}
