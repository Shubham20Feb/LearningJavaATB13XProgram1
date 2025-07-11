package ex_26_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_03_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Shubham");
        arrayList.add("Raj");
        arrayList.add("Raj"); // Duplicate is allowed
        arrayList.add(12);// Different data type is allowed

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l1 = new ArrayList(); // Dynamic dispatch
        l1.add("Shubham");
        l1.add("Raj");
        l1.add(123);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }


}
