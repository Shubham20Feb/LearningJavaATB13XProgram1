package ex_08_Switch;

public class Lab_08_JDK13ABOVE {
    public static void main(String[] args) {
        // in jdk 13>
        // No need to add the break
        // One line supported
        int itemcode = 003;
        switch (itemcode){
            case 001 -> System.out.println("oo1");
            case 002 -> System.out.println("002");
            case 003-> System.out.println("003");
            default -> System.out.println("defaulr");
        }
    }
}
