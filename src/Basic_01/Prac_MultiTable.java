package Basic_01;

public class Prac_MultiTable {
    public static void main(String[] args) {
        System.out.print("   | ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
            if (i == 9) System.out.println();
        }
        System.out.println("---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
