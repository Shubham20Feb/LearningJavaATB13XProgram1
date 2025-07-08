package ex_19_OOPs_Static;

public class Lab_02_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);

        System.out.println(ref1.a);
        System.out.println(ref1.b);
        System.out.println(ref2.a);

        System.out.println(ref1.b);
        System.out.println(ref2.b);

        ref1.displayValue();
        ref2.displayValue();

        A.staticMethod();


    }


}

class A {
    int a; // non static - instances variable
    static int b = 20; // static this is shared between object

    A(int a) {
        this.a = a;
    }

    void displayValue() {
        System.out.println(this.a);
        System.out.println(b); // Staic variable in instances method are allowed
    }

    static void staticMethod() {
        System.out.println("i will be called when class is loaded ");
        //  System.out.println(this.a); // Static method can not aces the non static variable in the function
        // Static will be loaded in the begining only so we will not be able to have the value of non static
    }
}
