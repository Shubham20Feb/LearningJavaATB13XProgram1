package ex_OOPs_Polymorphism.MethodOverLoading;

public class Lab_04_Calculator {
    public static void main(String[] args) {
        clc c1 = new clc();
        c1.add(9, 8);
        c1.add(7.99, 9.00);
    }

}

class clc {
    int attribute;

    int add(int a, int b) {

        return a + b;
    }

    double add(double a, double b) {
        return a + b;

    }
}
