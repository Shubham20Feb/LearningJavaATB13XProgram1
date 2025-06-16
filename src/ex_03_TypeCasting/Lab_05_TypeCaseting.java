package ex_03_TypeCasting;

public class Lab_05_TypeCaseting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 118.25F;
        //int total = course+GST; // Narow -- Implicite  not allowed
        int total = course + (int) GST; // Narrow - Explicte
        System.out.println(total);

        float total1 = course + GST; // Widening -auto - implicite
        float total2 = (float) course + GST; //wideinig - excplicte
        System.out.println(total1);
        System.out.println(total2);
    }
}