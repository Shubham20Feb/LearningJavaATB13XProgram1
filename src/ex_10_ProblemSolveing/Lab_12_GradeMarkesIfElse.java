package ex_10_ProblemSolveing;

import java.util.Scanner;

public class Lab_12_GradeMarkesIfElse {
    public static void main(String[] args) {
        // markes into grade
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the markes taht you want to see in grade");
        int markes = sc.nextInt();
        System.out.println("The markes entered is  : " + markes);
        if (markes < 0 && markes > 100) {
            System.out.println(" This is invalide no : " + markes);
        } else {
            if (markes >= 90) {
                System.out.println("Grdae A+");
            }
            else if (markes >= 80) {
                System.out.println("Grade A");
            }
            else if (markes >= 70) {
                System.out.println("Grade B+");
            }
            else if (markes >= 60) {
                System.out.println("Grade B");
            }
            else if (markes >= 50) {
                System.out.println("Grade C");
            }
            else if (markes > 40) {
                System.out.println("Grade D");
            }
            else {
                System.out.println(" Fail ");
            }
        }
        sc.close();


    }
}
