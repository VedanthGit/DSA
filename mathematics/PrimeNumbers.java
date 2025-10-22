package mathematics;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 55;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }
        for (int i = 2; i <= n; i++) {

            if (arr[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }

        }

        System.out.print("Prime numbers up to " + n + " are: ");
        for (int i = 2; i < n; i++) {
            if (arr[i] == true) {

                System.out.print(i + " ");
            }
        }
    }
}
