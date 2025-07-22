package ex_28_Enum;

public class Lab211_Enum {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colours.RED.getHexacode());
        System.out.println(Colours.GREEN.getHexacode());


        System.out.println(APIUrls.vwo.getUrl());
        System.out.println(APIUrls.google.getUrl());


    }
}
