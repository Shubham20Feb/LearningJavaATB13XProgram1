package ex_15_OOPs_Constructor;

public class Lab_05_OOPs_Parametrise_Constructor {
    public static void main(String[] args) {
        Baby12 b2 = new Baby12("Shubham", "7464764747", 12, 8, 12);
        Baby12 b3 = new Baby12("Raj", "7464764747", 18, 8, 12);
        System.out.println(b2.name);
        System.out.println(b3.name);
    }


}

class Baby12 {
    String name;
    String aadharno;
    int year;
    int month;
    int day;

    // Parametrize constructor
    Baby12(String name, String aadharno, int year, int month, int day) {
        this.name = name;
        this.aadharno = aadharno;
        this.year = year;
        this.month = month;
        this.day = day;


    }
}
