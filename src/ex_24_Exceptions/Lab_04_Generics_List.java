package ex_24_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Lab_04_Generics_List {
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("shubham");
        normalList.add(98.009);


        List<Integer> Integer = new ArrayList();
        Integer.add(9);
       // Integer.add("Shubham"); We can't add the string because it is Integer llist
    }
}
