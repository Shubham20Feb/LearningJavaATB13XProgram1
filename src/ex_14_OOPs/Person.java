package ex_14_OOPs;

public class Person {
    // These are called as Attribute, Properties, instance variable, member variable
    String name ;
    int age;
    String height;
    String gender;
    Boolean is_Married;
    //These are called as behaviour, member, member function, function, method
    //  1 with no return type and no declaration
    void walk(){

        System.out.println("Walking");
    }
    // Method 2 with no return type and with declaration
    void eat(String food){

        System.out.println("eating");
    }
    //Method 3 with return type and no Argument
    String sleep(){
        System.out.println("Sleeping");
        return null;

    }
    //Method 4 with  return type and  argument
    String sleep(int a){
        System.out.println("Sleeping");
        return null;

    }

}
