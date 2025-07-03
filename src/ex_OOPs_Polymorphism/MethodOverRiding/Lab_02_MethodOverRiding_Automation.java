package ex_OOPs_Polymorphism.MethodOverRiding;

public class Lab_02_MethodOverRiding_Automation {
    public static void main(String[] args) {
        chromeTc t1 = new chromeTc();
        t1.openBrowser();

        fireFox f1 = new fireFox();
        f1.openBrowser();

        commonToAll c1 = new commonToAll();
        c1.openBrowser();

        //Dynamic Dispatch
        commonToAll c2 = new chromeTc();
        c2.openBrowser(); // it will call chrome

        commonToAll c3 = new fireFox();
        c3.openBrowser();

    }


}

class commonToAll {
    void openBrowser() {
        System.out.println("Open IE Browser");
    }
}

class chromeTc extends commonToAll {
    @Override
    void openBrowser() {
        System.out.println(" Open the Chrome Browser");
    }
}

class fireFox extends commonToAll {
    @Override
    void openBrowser() {
        System.out.println(" Open the firefox Browser");
    }
}