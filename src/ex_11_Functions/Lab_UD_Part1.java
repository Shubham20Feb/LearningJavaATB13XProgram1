package ex_11_Functions;

public class Lab_UD_Part1 {
    public static void main(String[] args) {

        //Type 1 without argumnet/paramenter and without return type
        wp_wr_greet();

        //Type - 2without parameter with return type
        String name = wp_withreturn_type();
        System.out.println(name);

        //Type 3 With parameter / argument but  no return
        with_Parameter_wr("shubham", 34, 66879);
        //with_Parameter_wr("raj", 23, 989898);

        //Type 4 With parameter / argument with return
        int sum = sum_of_twono(7, 9);
        System.out.println(sum);
    }

    // Type 1 without parameter without returntype
    static void wp_wr_greet() {
        System.out.println("---Type 1 without parameter without returntype");
        System.out.println("hi how are you");
    }

    // Type 2 without parameter with return type
    static String wp_withreturn_type() {
        System.out.println("----Type 2 without parameter with return type");
        return "shubham";
    }

    //Type 3 With parameter / argument but  no return
    static void with_Parameter_wr(String name, int age, float salary) {
        System.out.println("----Type 3 with parameter without  return type");
        System.out.println("your name is : " + name + " your age is : " + age + " your salary is : " + salary);
    }
    //Type 4 With parameter / argument  with return

    static int sum_of_twono(int a, int b) {
        System.out.println("----Type 4 with parameter with return type");
        return a + b;
    }
}
