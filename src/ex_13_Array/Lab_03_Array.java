package ex_13_Array;

public class Lab_03_Array {
    public static void main(String[] args) {
         int[] marks = {66,77,99,87,54,44};

         // 2nd way to craete a array is
        int[] markes1 = new int[5];  // fixes size 5 // Index 0 to 4
        String[] name = new String[3]; // fixes size / length 3 // Index from 0 to 2
        name[0]="Shubham";
        name[1]="Raj";
        name[2]="Aman";
       // name[3]="raju";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        //System.out.println(name[3]); we have the index up to 2 if we print 3 it will throw exception


    }
}
