package ex_26_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_02_HashMap_Example {
    public static void main(String[] args) {
        Map<String,Integer> vechiles = new HashMap();
        vechiles.put("BMW",1);
        vechiles.put("Honda", 2);
        vechiles.put("Tesla",2);
        vechiles.put("Fortuner" , 3);
        //If we have the duplicate entery then it will take the latest one and replace the old one
        vechiles.put("Fortuner" , 9);
        //vechiles.put(12,35);

        System.out.println(vechiles);
        System.out.println("Total vechile : " + vechiles.size());

        //Iterator over the map
        //for each loop
        for (String Key: vechiles.keySet() ){
           // System.out.println("Key" + Key);
            System.out.println(Key +"-->" + vechiles.get(Key));
        }

        //If key is there or not
        if (vechiles.containsKey("Audi")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        //Clearing the Map
        vechiles.clear();
        System.out.println("After clearing the Map Size is  " + vechiles.size());


    }
}
