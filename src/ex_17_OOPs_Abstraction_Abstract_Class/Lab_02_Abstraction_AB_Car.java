package ex_17_OOPs_Abstraction_Abstract_Class;

public class Lab_02_Abstraction_AB_Car {
    public static void main(String[] args) {
        WagonaR car = new WagonaR();
        car.driveCar();
        // We can't call the engine class because it is abstract class
       // engine e1 = new engine();
    }


}

abstract class engine {
    // Below 2 are incomplete function they are abstract fuction
    abstract void StartEngine();

    abstract void StopEngine();

    void checkEngine() {
        System.out.println(" everything is good  ");
    }
}

class WagonaR extends engine {
    @Override
    void StartEngine() {
        System.out.println(" Start the car ");
    }

    @Override
    void StopEngine() {
        System.out.println(" Stop the car ");
    }

    void driveCar() {
        checkEngine();
        StartEngine();
        StopEngine();
    }

}
