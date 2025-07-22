package ex_28_Enum;

public enum Colours {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexacode;
    Colours(String hexacode){
        this.hexacode=hexacode;
    }
    String getHexacode(){
        return this.hexacode;
    }
}
