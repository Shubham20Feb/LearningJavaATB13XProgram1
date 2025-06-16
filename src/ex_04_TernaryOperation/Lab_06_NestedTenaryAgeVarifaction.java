package ex_04_TernaryOperation;

import org.w3c.dom.ls.LSOutput;

public class Lab_06_NestedTenaryAgeVarifaction {
    public static void main(String[] args) {
        // age - 23
        // age <18 = Minnor
        // 18< age > 65 // Adult
        // age>65 senior

        int age = 80;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

    }
}
