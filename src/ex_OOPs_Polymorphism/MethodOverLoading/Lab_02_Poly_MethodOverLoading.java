package ex_OOPs_Polymorphism.MethodOverLoading;

public class Lab_02_Poly_MethodOverLoading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(8);
        h1.task(true);

    }
}

class Home {

    void task() {
        System.out.println("Task 1");
    }

    int task(int a) {
        return a;
    }

    boolean task(boolean a) {
        return true;
    }
}
