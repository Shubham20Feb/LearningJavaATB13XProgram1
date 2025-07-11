package ex_26_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab_04_AL {
    public static void main(String[] args) {
        List list = new ArrayList();// Default size is 10
        List list1 = new ArrayList(11);  // Default size is 10
        list1.add(1);  //0
        list1.add(2);  //1
        list1.add(3);  //2
        list1.add(3);//3
        list1.add(5);//4
        list1.add("6");//5
        list1.add(true);//6
        list1.add(3);  //7
        list1.add("6");//5
        list1.add("6");//5
        list1.add("6");//5
        list1.add("6");//5


        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list.isEmpty());
        System.out.println(list1.contains(1));
        System.out.println(list1.contains("1"));


        // Return the index of the first occurrence of the specified element in the list

        System.out.println(list1.indexOf(3));
        System.out.println(list1.lastIndexOf(3));

        System.out.println(list1);
        System.out.println("0-------------");

        //How to print the list useing the for loop
        for (int i=0; i < list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("---------------");
        // for each loop
        for(Object o : list1){
            System.out.println(o);
        }
        list1.set(1,45); // to set the value
        list1.remove(0);  // remove the element at index 0
        System.out.println(list1);






        list1.clear();
        System.out.println(list1);











    }
}
