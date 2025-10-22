package mathematics;

public class CountDigits {

    public static void main(String[] args) {
        int n = 45867;
        int m = 12345;
        int count = 0;
        int c = 0;

        for (int i = n; i > 0; i /= 10) {
            count++;
        }
        System.out.println("Digit Count:" + count + "(for loop)");

        while (m > 0) {
            m /= 10;
            c++;
        }
        System.out.println("Digit Count:" + c + "(while loop)");
    }
}
