package ex_15_OOPs_Constructor;

public class Lab_04_OPPs_Constructor {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);
    }


}
class BabyA{

    String name ;
    String aadharno;
    int year;
    int month;
    int day;

    // Dc
    BabyA(){
        name ="Gugu";
        aadharno="0000";
        year=1972;
        month=1;
        day=3;
    }

}