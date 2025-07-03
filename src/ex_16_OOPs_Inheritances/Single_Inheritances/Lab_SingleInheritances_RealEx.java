package ex_16_OOPs_Inheritances.Single_Inheritances;

public class Lab_SingleInheritances_RealEx {
    public static void main(String[] args) {
        TestCase1 T1= new TestCase1();
        T1.RuningTc1();

        TestCase2 T2 = new TestCase2();
        T2.runingTC2();

        // Dynamic dispatch
        Lab_02_CommonToAll c1 = new Lab_02_CommonToAll();
        TestCase2 t3= new TestCase2();
        Lab_02_CommonToAll n2 = new TestCase1();// Dynamic Dispatch
        n2.readDataBaseFile();

        //WebDriver Driver = new ChromeDriver();// Dynamic Dispatch



    }
}
