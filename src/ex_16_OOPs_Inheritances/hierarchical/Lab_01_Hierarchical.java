package ex_16_OOPs_Inheritances.hierarchical;

public class Lab_01_Hierarchical {
    public static void main(String[] args) {
        Father F4 = new Father();
        Ruhani r5 = new Ruhani();

        r5.home();
        r5.r1();

        Pramod p1 = new Pramod();
        p1.home();

        Lucky l1 = new Lucky();
        l1.l2();
        l1.home();
    }

}

class Father {
    void home() {
        System.out.println("3BHK");
    }
}

class Pramod extends Father {
    void h2() {
        System.out.println("h2 - Pramod");
    }
}

class Lucky extends Father {

    void l2() {
        System.out.println("Lucky");
    }
}

class Ruhani extends Father {
    void r1() {
        System.out.println("ruhani");
    }
}
