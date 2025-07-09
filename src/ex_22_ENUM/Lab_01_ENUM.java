package ex_22_ENUM;

public class Lab_01_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
        System.out.println(Project_Name.google);
    }


}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Project_Name {
    google, restassured, katalon, vwo
}
// inted of useing this like the below we can use the enum function
//class A{
// String [] days = {"Mon", "Tue", "Wed","Thru","Sun"};
//}
