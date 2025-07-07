package ex_18_OOPs_Abtraction_InterFace;

public class Lab_02_Car_Practical_Interface {
    public static void main(String[] args) {
        car c1 = new car();
        c1.drive();
    }

}
class car implements Break,Engine{

    void drive(){
        applyBreak();
        startEngine();
        stopEngine();
    }

    @Override
    public Void applyBreak() {
        System.out.println("Applybreak");
        return null;
    }

    @Override
    public void startEngine() {
        System.out.println("SrartEngine");

    }

    @Override
    public void stopEngine() {
        System.out.println("StopEngine");

    }
}

interface Break{
    Void applyBreak();
}

interface Engine{
    void startEngine();
    void stopEngine();
    default void completeF1(){
        System.out.println("default is complete function");
    }

}
