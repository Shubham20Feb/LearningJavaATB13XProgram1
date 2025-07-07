package task_Date_07_Abstract;

public class Lab_06_Interface_Default_and_Static_Method {
    public static void main(String[] args) {
        Vehicle c1 = new car();
        c1.start();
        Vehicle.fuleType();


    }

}
interface Vehicle{
    default void  start(){
        System.out.println(" Vechile Start");
    }
    static void fuleType(){
        System.out.println("Fuel type is Petrol");
    }
}
class car implements Vehicle{
    //void fuleType(){

    }


