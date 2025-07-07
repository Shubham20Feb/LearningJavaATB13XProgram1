package ex_17_OOPs_Abstraction_Abstract_Class;

public class Lab_01_Abstraction {
    public static void main(String[] args) {
        car c1 = new car();
        //  father f1 = new father();
        child n1 = new child();
        father f2 = new child();
        f2.loan();
        f2.loan25k();
    }


}

class car {
    //This is concreate class
    //this don't have the abstract method
    void done() {

    }
}

abstract class father {
    // This is called as abstract method / functions;
    // This is not the complete function that's why it is abstract
    // if we have any one function that is abstract then whole class will become abstract
    abstract void loan();

    // we can have the complete function also
    //Complete function
    void loan25k() {
        System.out.println("Need to give the 25 k loan");
    }
}

class child extends father {

    @Override
    void loan() {
        System.out.println(" Child will give the father loan ");
    }
}