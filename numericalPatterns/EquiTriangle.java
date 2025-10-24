package numericalPatterns;

public class EquiTriangle {

    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = n - r; c >= 1; c--) {
                System.out.print(" ");
            }
            for (int s = r; s >= 1; s--) {
                System.out.print(s);
            }
            if (r == 1) {
                for (int c = 1; c <= r;) {
                    break;
                }
            } else {
                for (int c = 2; c <= r; c++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
