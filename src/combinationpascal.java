import java.util.Scanner;

public class combinationpascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int combined = Combined(n, m);
        System.out.println(combined);
    }

    private static int Combined(int n, int m) {
        if (n == m) return n;
        return n * Combined(n - 1, m);
    }
}
