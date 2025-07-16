package ex_15_OOPs_Constructor;

public class Lab_06_Pc_Real_Paramaterized_Constructor {
    public static void main(String[] args) {
        Person p1 = new Person("Shubham", "Gaya", 7777777);
        Person p2 = new Person("Raju", "BodhGaya",87999999);


        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.phoneno);

        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.phoneno);

        // We can do it like this also but not good practice
        // Person p3= new Person();
        // p3.name="Raju";
        // System.out.println(p3.name);

    }

}

class Person {
    String name;
    String address;
    long phoneno;
    //dc
    Person(){
        System.out.println("Default constructor");
    }

    Person(String name_user, String address_user, long phoneno_user) {
        this.name = name_user;
        this.address = address_user;
        this.phoneno = phoneno_user;

    }

}
