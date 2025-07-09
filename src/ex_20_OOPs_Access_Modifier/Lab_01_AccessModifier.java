package ex_20_OOPs_Access_Modifier;

public class Lab_01_AccessModifier {


}
class father{
    private int gold = 100;
    int car = 1;
     public int bhk2  = 1;

}
class child extends father{
    void weCanUse(){
       // System.out.println(gold); we can't use this is private
        System.out.println(car);
        System.out.println(bhk2);
    }
}