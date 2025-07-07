package task_Date_07_Abstract;

public class Lab_01_Animal_Sound {
    public static void main(String[] args) {


        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();

        Animal a1 = new Dog();
        a1.makeSound();
    }
}
abstract class Animal{
    abstract void makeSound();

}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Brak !!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat meows");
    }
}