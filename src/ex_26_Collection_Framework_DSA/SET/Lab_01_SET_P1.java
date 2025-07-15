package ex_26_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab_01_SET_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        // We can't add duplicate in the HashSet
        hs.add("raj");
        hs.add("shubham");
        hs.add("raj");

        System.out.println(hs);
    }
}
