package ex_04_TernaryOperation;

public class Lab_07_NestedTenaryOprate {
    public static void main(String[] args) {
        int a = 11;
        int b = 14;
        int c = 10;
         int maxno = (a>b)? (a>c)? a : c : (b>c)?b:c;
        System.out.println(maxno);
    }
}
