package ex_22_ENUM;

public enum Colors {

    RED("#FF0000"),
    BLUE("#HY6768"),
    GREEN("#HY6383"),
    YELLOW("/#UY56455");


    private String hexCode;

    Colors(String hexCode) {
        this.hexCode = hexCode;
    }

    String getHexCode() {
        return this.hexCode;
    }
}
