package ex_26_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_10_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        fruits2.add(12);
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List all_Fruits = new ArrayList();
        all_Fruits.add(fruits1);
        all_Fruits.add(fruits2);
        all_Fruits.add(vegatables);
        System.out.println(all_Fruits);

        System.out.println(all_Fruits.get(1));
    }
}
