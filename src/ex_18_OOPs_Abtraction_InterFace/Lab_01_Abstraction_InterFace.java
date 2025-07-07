package ex_18_OOPs_Abtraction_InterFace;

public class Lab_01_Abstraction_InterFace {
    public static void main(String[] args) {
     Rectangle area1 = new Rectangle();
     area1.getArea(6,9);

     Square area2 = new Square();
     area2.getArea(8,8);


    }


}
class Rectangle implements Polygon{
    @Override
    public void getArea(int length , int breadth){
        System.out.println("Area of rectangle is :: " + length * breadth);
    }
}

class Square implements Polygon {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Square is " + length * breadth);
    }
}

interface Polygon {
    void getArea(int length, int bredth);

    // We can have complete fuction useing KeyWord Default
    default void complte() {
        System.out.println("Complete function useing default in interface ");
    }

    // Wecan have n no of default function
    default void complte1() {
        System.out.println("Complete1 function useing default in interface ");
    }

    //We can have complete fuction useing KeyWord static
    static void staticComplte() {
        System.out.println("Complete function useing static  in interface");
    }

    // We cannot have complete function in the interface
    //  void abh(){
    // }
}

//in abstract class it is posible to have the complete function
abstract class abcf {
    abstract void m1();

    void complete() {
        System.out.println("Complete function");
    }

}
