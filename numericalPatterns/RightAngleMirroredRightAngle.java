package numericalPatterns;

public class RightAngleMirroredRightAngle {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            // Spaces ((n - r) * 2) - 1
            for (int s = ((n - r) * 2) - 1; s >= 1; s--) {
                System.out.print(" ");
            }
            if (r == n) {
                for (int c = r - 1; c >= 1; c--) {
                    System.out.print(c);
                }
            } else {
                for (int c = r; c >= 1; c--) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
