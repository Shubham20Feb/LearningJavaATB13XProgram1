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
        // We use the constructor in automation for the below things
        //Featch data from the mysqal database
        //Read from csv file ,xlsx
        //open a file and read the data
    }

    // Behaviour
    void cary() {
        System.out.println("Craying");
    }

    void sleeo() {
        System.out.println("sleep");
    }

    void eat() {
        System.out.println("eating");
    }

}
