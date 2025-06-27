package ATB_XM_Test_Programs;

public class Pattern_Nestloops {
    public static void printpattern(int n){
        int i,j;
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=3;
        printpattern(n);
        }
    }
