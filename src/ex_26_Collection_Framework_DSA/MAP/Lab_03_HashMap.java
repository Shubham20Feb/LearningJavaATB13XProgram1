package ex_26_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab_03_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,102);
        // it will be overridden
        map.put(null,103);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        //Key will be printed
        System.out.println(map.keySet());
        //Value will be printed
        System.out.println(map.values());

        System.out.println(map.get("id2"));
        System.out.println(map.remove("id2"));
        System.out.println(map);



    }
}
