package ex_22_ENUM;

public enum Locatores {
    page_inpute_email("login-username"),
    page_inpute_password("#Login-pasword"),
    page_button("#btn");


    private String  Locatores;

    Locatores(String locatores){
        this.Locatores = locatores;
    }
    public String getLocatores() {
        return this.Locatores;
    }




}
