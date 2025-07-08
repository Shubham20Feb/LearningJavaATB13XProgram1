package ex_22_ENUM;

public enum APIURLS {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.vwo.com"),
    google("https://google.vwo.com");

    private String url;

    APIURLS(String url){
        this.url=url;
    }
    String getUrl(){
        return this.url;
    }
}
