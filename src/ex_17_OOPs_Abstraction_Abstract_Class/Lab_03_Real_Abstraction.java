package ex_17_OOPs_Abstraction_Abstract_Class;

public class Lab_03_Real_Abstraction {
    public void main(String[] args) {

        // We can't show the employ class
        //This is incomplete class
        // employ e1 = new employ() ;
        company c1 = new company();
        c1.computePay();


    }

    class company extends employ {
        @Override
        double computePay() {
            return 1000;

        }
    }

    abstract class employ {
        // All the variable will be in the private because of incapsulation
        private String name;
        private String address;
        private int number;

        // Default constructor
        employ() {
            System.out.println(" DC");
        }

        // Parametrized constructor
        employ(String name, String address, int number) {
            System.out.println(" Constructing an Employes");
            this.name = name;
            this.address = address;
            this.number = number;

        }

        // Abstract function that is incomplete
        abstract double computePay();

        // Concert function that is complete
        void mailCheck() {
            System.out.println("Mailing a check to " + this.name + this.address + this.number);
        }


    }
}
