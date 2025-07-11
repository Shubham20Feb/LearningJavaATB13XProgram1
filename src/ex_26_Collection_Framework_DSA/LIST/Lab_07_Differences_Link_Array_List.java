package ex_26_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_07_Differences_Link_Array_List {
    public static void main(String[] args) {

        List myList = new ArrayList(8);
        List myList1 = new ArrayList();  // Array formate -- Continous

        List myList2 = new LinkedList(); // Doubly Linked List

        myList2.add("Shubham");
        myList2.add("Raj");
        myList2.add("Aman");
        myList2.add("Alock");
        myList2.add("Ayuesh");
        myList2.add(null);
        myList2.add(true);
        myList2.add(123);
        System.out.println(myList2);

        System.out.println(myList2.isEmpty());
        System.out.println(myList2.size());
        System.out.println(myList2.contains("Raj"));
        System.out.println(myList2.indexOf("Aman"));

        System.out.println("--------");

        Iterator iterator= myList2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
