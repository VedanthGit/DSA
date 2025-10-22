package starPatterns;

public class Rectangle {

    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        for (int r = 1; r <= n; r++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
