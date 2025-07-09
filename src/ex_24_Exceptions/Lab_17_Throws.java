package ex_24_Exceptions;

import java.io.FileInputStream;

public class Lab_17_Throws {
    public static void main(String[] args) {

    }
    // throws is used for the methods
    // try catch with block
    static void t()throws Exception{
        FileInputStream fileInputStream = new FileInputStream("c://a.txt");
    }
}
