package ex_30_Exceptions;

public class Lab236_CustomException_Example {
    public static void main(String[] args) throws CurrencyMismatchCustomException {
     /*   Bank sbi=new Bank("INR",100);
        Bank ICICI= new Bank("INR",200);
       int total= sbi.add(ICICI);
        System.out.println(total);

        Bank Jp_chase= new Bank("USD",200);
        int total2=Jp_chase.add(sbi);--here thee mistake
        System.out.println(total2);*/
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        int total  = sbi.add(icici);
        System.out.println(total);

        Bank jp_chase = new Bank("USD",101);
        int total_new = sbi.add(jp_chase);
        System.out.println(total_new);
    }
}
