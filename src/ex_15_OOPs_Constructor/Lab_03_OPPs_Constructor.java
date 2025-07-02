package ex_15_OOPs_Constructor;

public class Lab_03_OPPs_Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.modal);
        System.out.println(c1.year);
        // By default, the constructor name will be assigned
        System.out.println(c2.name);

        Baby1 b1 = new Baby1();
        //After some time if we want to change tge name
        b1.name = "Raj";
        System.out.println(b1.name);
    }

}

class Car {
    String name;
    int year;
    String modal;

    // Default constructor
    Car() {
        name = "Tarzen";
        year = 1996;
        modal = "XX";
    }
}

class Baby1 {
    String name;

    Baby1() {
        name = "Gugu";
    }
}