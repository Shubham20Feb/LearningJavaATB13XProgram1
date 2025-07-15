package ex_26_Collection_Framework_DSA.LIST;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Lab_11_Interview {
    public static void main(String[] args) {
        List markes = new ArrayList();
        markes.add(77);
        markes.add(87);
        markes.add(56);
        markes.add(99);
        markes.add(100);

        System.out.println(markes);
        // To sort  we need to use the collections
        Collections.sort(markes);
        System.out.println(markes);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)
        Collections.sort(markes,Collections.reverseOrder());
        System.out.println(markes);

    }
}
