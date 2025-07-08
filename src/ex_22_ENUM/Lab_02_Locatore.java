package ex_22_ENUM;

public class Lab_02_Locatore {
    public static void main(String[] args) {
        System.out.println(Locatores.page_inpute_email.getLocatores());
        System.out.println(Locatores.page_button.getLocatores());
        System.out.println(Locatores.page_inpute_password.getLocatores());
        // Colour
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.BLUE.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());
        System.out.println(Colors.YELLOW.getHexCode());


        //APIURL
        System.out.println(APIURLS.vwo.getUrl());
        System.out.println(APIURLS.katalon.getUrl());
        System.out.println(APIURLS.google.getUrl());
    }
}
