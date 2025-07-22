package ex_28_Enum;

public enum APIUrls {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String Url;

    //Parameterized constructor(PC)
    APIUrls(String url){
        this.Url=url;
    }
    String getUrl(){
        return this.Url;
    }
}
