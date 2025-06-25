package ex_13_Array;

public class Lab_11_ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1,23,45,32,56};
        int[] copy = new int[original.length];
        System.arraycopy(original,0,copy, 0,original.length);
        System.out.println(copy);
    }
}
