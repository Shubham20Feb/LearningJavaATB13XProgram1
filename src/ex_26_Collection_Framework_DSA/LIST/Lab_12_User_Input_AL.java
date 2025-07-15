package ex_26_Collection_Framework_DSA.LIST;


import java.util.ArrayList;
import java.util.Scanner;

public class Lab_12_User_Input_AL {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        ArrayList<String> names = new ArrayList<>();
        ArrayList ages = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        String continueInput = "Y"; // Control variable for input loop

        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enater the name ");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age ");
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to continue ? (Y/N) ");
            continueInput = scanner.nextLine();
        }

        for (Object o1 : names) {
            System.out.println(o1);
        }
        for (Object o2 : ages) {
            System.out.println(o2);
        }
        scanner.close();

    }
}
