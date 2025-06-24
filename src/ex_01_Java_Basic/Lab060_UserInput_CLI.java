package ex_02_userInput;

public class Lab060_UserInput_CLI {
    public static void main(String[] args) {
        String ageString=args[0];
        System.out.println(ageString);
        int age=Integer.parseInt(ageString);
        String CanIVote=age>18?"Yes":"No";
        System.out.println(CanIVote);
    }
}
