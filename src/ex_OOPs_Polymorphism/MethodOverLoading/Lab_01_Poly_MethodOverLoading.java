package ex_OOPs_Polymorphism.MethodOverLoading;

public class Lab_01_Poly_MethodOverLoading {
    public static void main(String[] args) {
        MathOprations m1 = new MathOprations();
        int r1 = m1.add(12, 43);
        int r2 = m1.add(2, 7, 8);
        double r3 = m1.add(6.8, 9.0);
        String r4 = m1.add("Shubham", "Raj");

    }

}

class MathOprations {


    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}
