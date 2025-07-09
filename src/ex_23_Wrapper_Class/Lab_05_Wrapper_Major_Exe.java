package ex_23_Wrapper_Class;

public class Lab_05_Wrapper_Major_Exe {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1,"iphone 15",12000.09);
        Mobile samsung = new Mobile(2,"max78",67688.98);

        iphone.setPrice(200000.00);
        iphone.display();
        samsung.display();

        //System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMOde();

        System.out.println(Covers.red.getColour());


    }


}

// Single inheritances
class Mobile extends oldPhone {
    // Encapsulation

    private Integer phone;

    // getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Encapsulation
    private String name;
    private Double price;
    private String mobile_carrier = "airtale";

    // Default constructor
    Mobile() {
        System.out.println("Default constructor");
    }

    // Parametrise Constructor
    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    // Non Staticfunction
    void display() {
        System.out.println(this.name + this.phone + this.price);
    }

    // Static function
    static void switchOnAirplaneMOde() {
        System.out.println("Common Airplane Mode ");
    }

    // Method Overloading
    void priceChange(Integer price) {
        System.out.println("Change price in Interger");
    }

    // Method Overloading Same name but different parameter
    void priceChange(Double price) {
        System.out.println("change price in the decimal ");
    }


    // Override function of the calling
    @Override
    void calling() {
        System.out.println("Dialpad --> touch display now !!!");
    }
}

class oldPhone implements SimCard {

    void calling() {
        System.out.println("dialpad");
    }

    @Override
    public void enterSimCard() {
        System.out.println("Card entered ");

    }
}

//enum
enum Covers{
    red("red pokeman"),
    blue("blue pokemon");
    private String colour;

    // PARAMETRISED CPNSTRUCTOR
    Covers(String colour){
        this.colour=colour;
    }
    String getColour(){
        return this.colour;
    }
}

// Abstraction of sim card
interface SimCard {
    void enterSimCard();
}

