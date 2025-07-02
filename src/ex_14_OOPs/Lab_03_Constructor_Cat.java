package ex_14_OOPs;

public class Lab_03_Constructor_Cat {
    // We can use the constructor in the  main class area
    Lab_03_Constructor_Cat() {
        System.out.println("Default constructor ");
    }

    public static void main(String[] args) {
        cat c1 = new cat(); // new object creted
        new cat();// new object created
        cat c2; // no objected will we craeted

        c1.runing();
        //if object is not created the behavior is not available
        //  c2.runing();// it will not run because the object is not created

        new cat().runing();// it will execute because the object is created


    }

}

class cat {

    String name;


    void runing() {
        System.out.println("Runing");
    }
}
