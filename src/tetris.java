import java.util.Scanner;

public class tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();

        int[][] arr = new int[C][R];

        for (int i = 0; i < C; i++) {
            for (int k = 0; k < R; k++) {
                arr[i][k] = sc.nextInt();
            }
        }


    }
}
