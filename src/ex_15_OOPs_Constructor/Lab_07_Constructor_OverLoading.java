package ex_15_OOPs_Constructor;

public class Lab_07_Constructor_OverLoading {
    public static void main(String[] args) {
        Raju r1 = new Raju("Ranu","Gyaa",87888838888L);
        Raju r2 = new Raju("Ram","Gyaya",8788898888L);
        Raju r3 = new Raju();

        r3.name="Sayam";


    }

}

class Raju{
    String name;
    String address;
    long phoneno;

    Raju(String name_user){
        this.name=name_user;

    }
    Raju(){

    }
    Raju(String name_user,String address_User,Long phoneno_user){
        this.name=name_user;
        this.address=address_User;
        this.phoneno=phoneno_user;


    }
    Raju(String name_user,String address_User){
        this.name=name_user;
        this.address=address_User;

    }

}
