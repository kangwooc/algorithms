import java.util.Scanner;

public class eightnine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = sc.nextInt();
            }
        }

        int[][] filped = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                filped[i][m - k - 1] = arr[i][k];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m - 1; k++) {
                System.out.print(filped[i][k] + " ");
            }
            System.out.println(filped[i][m - 1]);
        }
    }
}
