package numericalPatterns;

public class ReverseNumberPrintRightAngle {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = r; c >= 1; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
