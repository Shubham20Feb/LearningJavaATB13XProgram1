package task_Date_07_Abstract;

public class Lab_05_Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {
        Document d1 = new Document();
        d1.print();
        d1.show();
    }


}
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Document implements Printable,Showable{
    @Override
    public void print(){
        System.out.println("Printing Document");
    }
    @Override
   public void show(){
        System.out.println("Showing Document");

    }
}
