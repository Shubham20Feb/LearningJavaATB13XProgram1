package ex_26_Collection_Framework_DSA.QUEUE;

import java.util.*;

public class Lab_02_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(19);


        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
