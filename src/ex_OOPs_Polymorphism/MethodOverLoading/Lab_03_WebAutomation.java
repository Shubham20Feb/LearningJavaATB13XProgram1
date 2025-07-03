package ex_OOPs_Polymorphism.MethodOverLoading;

public class Lab_03_WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.StartBrowser();
        b1.StrartBrowser("chrome");
    }

}
class Browser{

    void StartBrowser(){
        System.out.println("Staring  a default Browser ");
    }
    String StrartBrowser(String browser){
        System.out.println("Starting browser " + browser);
        return browser;
    }

}
