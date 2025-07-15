package ex_26_Collection_Framework_DSA.SET;


import java.util.*;

public class Lab_02_HS_LHS_TS_DIFF {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        // hs.add(123);
        hs.add(null);
//        hs.add(null);

        System.out.println(hs);
        for (Object o: hs){
            System.out.println(o);
        }
        System.out.println("_______________________");
        //Itreator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_______________________");

        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        System.out.println("_______________________");

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add(123); shorting can't be done so different type,of data type can not be applied same with null
        // ts.add(null);
        System.out.println(ts);
        System.out.println("___For Each Loop___");

        for (Object o : ts){
            System.out.println(o);
        }


    }
}
