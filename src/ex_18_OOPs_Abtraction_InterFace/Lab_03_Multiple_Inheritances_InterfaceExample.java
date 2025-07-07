package ex_18_OOPs_Abtraction_InterFace;

public class Lab_03_Multiple_Inheritances_InterfaceExample {
    public static void main(String[] args) {
        child c1 = new child();
        c1.money();
    }
}

interface father1 {
    void money();
}

interface father2 {
    void money();
}

class child implements father1, father2 {
    @Override
    public void money() {
        System.out.println("child  money ");
    }
}
