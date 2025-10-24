package numericalPatterns;

public class ReverseRightAngleTraingle {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = n - r; c >= 1; c--) {
                System.out.print(" ");
            }
            for (int k = r; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
