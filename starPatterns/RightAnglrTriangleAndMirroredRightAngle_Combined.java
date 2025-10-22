package starPatterns;

public class RightAnglrTriangleAndMirroredRightAngle_Combined {

    public static void main(String[] args) {
        int n = 5;

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - r); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= r; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
