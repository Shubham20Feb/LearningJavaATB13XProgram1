package ex_26_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab_13_All_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Amit",1);
        Student s2 = new Student("Ritwik",2);
        Student s3 = new Student("Shubham",3);

        List myStudent = new ArrayList();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);

        s1.displaydetails();
        s2.displaydetails();
        s3.displaydetails();

    }

}
class Student {
    private String name;
    private int rollNo;

    // Generate Parametrized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }

    // for encapsulation purpose
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displaydetails(){
        System.out.println("Student name: " + this.name);
        System.out.println("Student RollNo: " + this.rollNo);

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';


    }
    }
