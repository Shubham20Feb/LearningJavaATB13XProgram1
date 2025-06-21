package ex_10_ProblemSolveing;

import java.util.Scanner;

public class Lab_13_MarkesToGrade_Switch {
    public static void main(String[] args) {
        // Useing switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the markes that you want to conver into Grade : ");
        int markes = sc.nextInt();
        System.out.println("The markes entered is : " + markes);

        if (markes < 0 || markes > 100) {
            System.out.println(" The markes is not valide markes ");
        } else {
            // calculate useing switch
            switch (markes / 10) {
                case 10:
                case 9:
                    System.out.print("Grade A+");
                    break;
                case 8:
                    System.out.println("Grade A");
                    break;
                case 7:
                    System.out.println("Grade B+");
                    break;
                case 6:
                    System.out.println("Grade B");
                    break;
                case 5:
                    System.out.println("Grade C");
                    break;
                case 4:
                    System.out.println("Grade D");
                    break;
                default:
                    System.out.println("Fail");
            }

        }
    }
}
