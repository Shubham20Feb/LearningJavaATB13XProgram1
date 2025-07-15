package ex_26_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab_01_MAP_P1 {
    public static void main(String[] args) {
       // Map m = new Map();
        Map m1 = new HashMap(10);
        // Map is key and value pair
        // name -> pramod
        m1.put("name","shubham");
        m1.put("rollNo", 1);
        m1.put("phone", 678893830);

        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","shubham");
        m2.put("rollNo", 1);
        m2.put("phone", 678893830);

        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("name","shubham");
        m3.put("rollNo", 1);
        m3.put("phone", 678893830);

        System.out.println(m3);

    }
}
