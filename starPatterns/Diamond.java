package starPatterns;

public class Diamond {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (2 * r - 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int r = n - 1; r > 0; r--) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (2 * r - 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
