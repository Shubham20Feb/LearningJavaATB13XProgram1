package ex_14_OOPs;

public class Lab_02_Constructor {
    public static void main(String[] args) {
       // How many time constructor will be called
       // 2 time
       Student s1 = new Student();// 1 st time Object creation
       Student s2;// it will not called here because this is references creation not the object creation
       new Student();// 2 nd time object creation

    }

}

class Student{
    // Attribute
    String name ;

   // Constructor
    Student(){
        System.out.println("Default constructor ");

    }

    // function , behavioue
    void sleep(){
        System.out.println("sleeping");
    }
}
