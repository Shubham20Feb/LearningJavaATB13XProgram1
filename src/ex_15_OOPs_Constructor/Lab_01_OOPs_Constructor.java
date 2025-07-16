package ex_15_OOPs_Constructor;

public class Lab_01_OOPs_Constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby();
    }


}

class Baby {
    // Attribute// Instance Variable // Member Variable , data member
    String name;


    //Default constructor
    Baby() {
        System.out.println(" I am Default constructor ");
        System.out.println("You can create the adhare card of the baby");
        // We use the constructor in automation for the below things
        //Fetch data from the mysql database
        //Read from csv file, xlsx
        //open a file and read the data
    }

    // Behaviour// method function
    void cary() {
        System.out.println("Craying");
    }

    void sleep() {
        System.out.println("sleep");
    }

    void eat() {
        System.out.println("eating");
    }
    // method
    void m1(){
        System.out.println("Method is not called automatically");
    }

}
