package numericalPatterns;

public class RightAngleAndMirroredRightAngle {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            for (int s = (n - r) * 2; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int c = r; c >= 1; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
