package ex_08_Switch;

public class Lab_06_Interview2 {
    public static void main(String[] args) {
        // char is also a integer
        char ch = 'A';
        switch (ch){
            case 65 :
                System.out.println("Match ASSII");
                break;
            default:
                System.out.println("No idea ");
                break;
        }
    }
}
