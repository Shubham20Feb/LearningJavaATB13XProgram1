package ex_19_OOPs_Static;

public class Lab_04_RealStaticExample {

}

class ATB {
    static {
        System.out.println("Load the class i!! will execute");
    }

    {
        System.out.println("IIB - THIS IS called when object is created ");
        // what is the perpose??
        //Here you can write code related to
        // Starting a website or anything before starting the
        // web automation or api
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name; // non static
    private String phone;  // non static

    static String courseName = "ATB13x";  // static that is common to all
    static String mentoreName = " Premod";// static that is common to all

    static void doAssigment() {
        System.out.println("Do Assigmnet ");
        //System.out.println(phone);//static method can't access the non static
    }

    static void joinClass() {
        System.out.println("Clasess joined ");
    }

    void howTheyDoAssigmnet() {
        System.out.println("it is different for all");
    }


}
