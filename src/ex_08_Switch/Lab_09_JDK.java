package ex_08_Switch;

public class Lab_09_JDK {
    public static void main(String[] args) {
        int itemcode = 007;
        switch (itemcode){
            case 001,002,003:
                System.out.println("it is eating pro");
                break;
            case 004 , 005:
                System.out.println("it is online gaugate");
                break;
            case 006, 007 :
                System.out.println("it is playing game ");
                break;
            default:
                System.out.println("don't knoe ");
                break;
        }
    }
}
