package task_Date_07_Abstract;

public class Lab_04_Abstract_VS_ConcereteMethod {
    public static void main(String[] args) {
        child c1 = new child();
        c1.display();
        c1.show();
    }


}
abstract class Parent{
    abstract void show();

    void display(){
        System.out.println("This is display  concrete method ");
    }

}
class child extends Parent{
    @Override
    void show(){
        System.out.println("This is the show mwthod ");
    }
}
