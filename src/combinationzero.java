import java.util.Scanner;

public class combinationzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = combined(n, m);
        int count = 0;
        while (result % 10 != 0) {
            count++;
            result /= 10;
        }
        System.out.println(count);
    }

    private static int combined(int n, int m) {
        if (m == n || m == 0) return 1;
        return combined(n-1, m-1) + combined(n - 1, m);
    }
}
