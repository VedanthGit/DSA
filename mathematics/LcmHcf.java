package mathematics;

public class LcmHcf {

    public static void main(String[] args) {
        int a = 18;
        int b = 12;

        int x = a;
        int y = b;

        int n = Math.max(a, b);
        int lcm = 0;
        for (int i = n; i <= a * b; i++) {

            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int hcf = x;

        System.out.println("LCM: " + lcm);
        System.out.println("HCF: " + hcf);
    }
}
