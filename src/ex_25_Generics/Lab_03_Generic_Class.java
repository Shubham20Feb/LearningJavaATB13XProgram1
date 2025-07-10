package ex_25_Generics;

public class Lab_03_Generic_Class {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass(8);
        GenericClass g2 = new GenericClass("Shubham");
        GenericClass g3 = new GenericClass(true);
        GenericClass g4 = new GenericClass(10.88);

    }

}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;


    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
