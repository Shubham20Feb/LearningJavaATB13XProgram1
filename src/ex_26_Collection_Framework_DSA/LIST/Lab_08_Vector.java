package ex_26_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab_08_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(7);

        v.add("Shubham");
        v.add("Raj");
        v.add("Aman");
        v.add("sss");
        v.add("jjj");
        System.out.println(v);
        v.remove(0);
        System.out.println(v.contains("Raj"));
        System.out.println(v);


        for (int i = 0 ; i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("For each loop   --");
        for (Object o : v){
            System.out.println(o);
        }
        System.out.println("_______Itreatore");

        Iterator iterator= v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

        System.out.println("---Enumeration");
        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
