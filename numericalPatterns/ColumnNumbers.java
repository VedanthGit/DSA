package numericalPatterns;

public class ColumnNumbers {
    public static void main(String[] args) {
        int n =5;
        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
