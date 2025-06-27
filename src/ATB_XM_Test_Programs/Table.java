package ATB_XM_Test_Programs;

public class Table {
    public static void main(String[] args) {
        int range = 10; // Define the upper limit for the multiplication table (e.g., up to 10)

        System.out.println("Multiplication Table:");


        for (int i = 1; i <= range; i++) {

            for (int j = 1; j <= range; j++) {

                System.out.printf("%d * %d = %d\t", i, j, (i * j));
            }
            System.out.println();
        }
    }
}
