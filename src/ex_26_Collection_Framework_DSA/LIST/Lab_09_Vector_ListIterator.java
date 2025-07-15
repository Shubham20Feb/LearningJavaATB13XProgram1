package ex_26_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab_09_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("item1");
        v1.add("item2");
        v1.add("item3");
        v1.add("item4");
        v1.add("item5");

        ListIterator ListIterator = v1.listIterator() ;
        while (ListIterator.hasNext()){
            System.out.println(ListIterator.next());
        }
        while (ListIterator.hasPrevious()){
            System.out.println(ListIterator.previous());
        }

        System.out.println("----------");


        Iterator iterator = v1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
