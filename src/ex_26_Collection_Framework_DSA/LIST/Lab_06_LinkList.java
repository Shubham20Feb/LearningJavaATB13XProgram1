package ex_26_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab_06_LinkList {
    public static void main(String[] args) {
        LinkedList <String>  animal = new LinkedList();

        animal.add("DOG");
        animal.add("CAT");
        animal.add("LION");
        animal.add("DOG"); // CAN YOU DUPLICATE
        animal.add("Elephant");

        System.out.println( "LinkedList :: " + animal);

        //Accessing Element
        System.out.println("First element : " + animal.getFirst());
        System.out.println("Last element :" + animal.getLast());

        //removing element
        animal.removeFirst();
        animal.removeLast();

        System.out.println("LinkedList after removal :: " + animal);
        System.out.println("Size of LinkedList : " + animal.size());


    }
}
