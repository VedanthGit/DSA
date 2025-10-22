package starPatterns;

public class ButterflyMerged {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }

            if (r < n) {
                for (int k = 1; k <= 2 * (n - r) - 1; k++) {
                    System.out.print("  ");
                }
            }
            if (r == n) {
                for (int l = 1; l < r; l++) {
                    System.out.print("* ");
                }
            } else {
                for (int l = 1; l <= r; l++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int r = n - 1; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            for (int c = 1; c <= 2 * (n - r) - 1; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
