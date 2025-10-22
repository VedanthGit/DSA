package mathematics;

public class Factors {

    public static void main(String[] args) {
        int n = 12;
        int m = 32;
        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");

            }
        }

        System.out.print("Factors of " + m + " are: ");
        for (int j = 1; j <= Math.sqrt(m); j++) {
            if (m % j == 0) {
                System.out.print(j + " ");
                if (j != m / j) {
                    System.out.print(m / j + " ");
                }
            }
        }
    }
}
