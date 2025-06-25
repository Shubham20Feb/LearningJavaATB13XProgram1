package ex_13_Array;

public class Lab_09_CLI_StringArray_ForEach {
    public static void main(String[] args) {

        for (int i =0; i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("--------------------");
        // for each loop
        for(Object o : args){
            System.out.println(args);
        }
    }
}
