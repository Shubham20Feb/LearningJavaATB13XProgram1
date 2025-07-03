package ex_16_OOPs_MultiLeve_Inheritances;

public class Lab_02_MultileveInheritances {
    public static void main(String[] args) {
        Son amit = new Son();
        //Son RAJ = new GrandFather();  not posible
        //Son su = new Father(); not posible
        GrandFather gt = new Son();// dynamic dispatch
        gt.gf();
        gt.home();

        //
    }
}
