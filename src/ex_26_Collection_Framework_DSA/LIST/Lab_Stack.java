package ex_26_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("Java");
        s1.add("Paython");
        s1.add("C#");

        System.out.println(s1);

        System.out.println(s1.peek()); // will use to see the top element
        System.out.println(s1.pop()); // remove the top element
        System.out.println(s1);

        // create a integer type stack
        Stack<Integer> s2 = new Stack<>();
        // s2.add("raj"); we can't add the string in the integer type array
        s2.add(13);

        s2.push(45);
        s2.push(87);
        s2.push(99);
        System.out.println(s2);

        // Create String type Stack
        Stack<String> s3 = new Stack<>();
        s3.add("Raj");
    }
}
