package task_Date_07_Abstract;

public class Lab_02_Bank_Interest_Calculation {
    public static void main(String[] args) {
        Hdfc h1 = new Hdfc();
        h1.getInterestRate();

        Sbi s1 = new Sbi();
        s1.getInterestRate();
    }


}
abstract class Bank{

    abstract  void getInterestRate();

}
class Hdfc extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("HDFC Interest Rate: 7.0%");

    }
        }
class Sbi extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("SBI Interest Rate: 6.5%");
    }
}