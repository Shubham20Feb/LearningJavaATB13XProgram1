package task_Date_07_Abstract;

public class Lab_03_Constructor {
    public static void main(String[] args) {
        method m1 = new method();
        m1.display();
    }


}

abstract class Main{

    Main(){
        System.out.println("Message from Dc constructore ");
    }
    void Two(){
        System.out.println("This is method in abstract class");
    }
}
class method extends Main{
    void display(){
        Two();
    }

}
