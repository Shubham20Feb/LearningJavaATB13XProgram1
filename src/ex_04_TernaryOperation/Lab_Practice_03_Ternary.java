package ex_04_TernaryOperation;

public class Lab_Practice_03_Ternary {
    public static void main(String[] args) {

        //Marks 90 = A+,
        //  75 = A,
        // 60 = B, 40 = C,
        //  below 40 F59l.
        int markes = 91;
        String grade =(markes >= 90) ? "A" : (markes>=75) ? "A" : (markes>=60)? "B" : (markes >=40)? "C" : "Fail";
        System.out.println( grade);
    }
}
