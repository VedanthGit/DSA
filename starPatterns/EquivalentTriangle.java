package starPatterns;

public class EquivalentTriangle {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * r - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
