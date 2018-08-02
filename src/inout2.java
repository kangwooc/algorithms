import java.util.Scanner;

public class inout2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int size = 10;
        int[][] arr = new int[size][size];

        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int fliped_num = 0;

        while (fliped_num < n) {
            for (int k = 0; k < size; k++) {
                if (arr[k][fliped_num] == 1) {
                    arr[k][fliped_num] = 0;
                } else if (arr[k][fliped_num] == 0) {
                    arr[k][fliped_num] = 1;
                }
            }

            for (int k = 0; k < size && k != fliped_num; k++) {
                if (arr[fliped_num][k] == 1) {
                    arr[fliped_num][k] = 0;
                } else if (arr[fliped_num][k] == 0) {
                    arr[fliped_num][k] = 1;
                }
            }

            for (int k = 0; k <= fliped_num; k++) {
                for (int j = 0; j <= fliped_num; j++) {
                    if (k != j && (k % (fliped_num + 1) == fliped_num || j % (fliped_num + 1) == fliped_num)) {
                        if (arr[k][j] == 0) {
                            arr[k][j] = 1;
                        } else {
                            arr[k][j] = 0;
                        }
                    }
                }
            }

            fliped_num++;
        }

        for (int k = 0; k < size; k++) {
            for (int h = 0; h < size - 1; h++) {
                System.out.print(arr[k][h] + " ");
            }
            System.out.println(arr[k][size - 1]);
        }
        sc.close();
    }
}
