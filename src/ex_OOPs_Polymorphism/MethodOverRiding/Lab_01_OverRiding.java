package ex_OOPs_Polymorphism.MethodOverRiding;

public class Lab_01_OverRiding {

    // Methods overload will be in the same class
    // Methode OverRiding will we in two different class
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
    }


}

class Animal {

    void Sound() {
        System.out.println("Default sound ");
    }
}

class Dog extends Animal {

    @Override
    void Sound() {
        System.out.println("Bark !!!!");
    }

    void methodOverLoad() {

    }

    void methodOverLoad(int a) {

    }

}
