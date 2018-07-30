import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int size = 10;
        int i = sc.nextInt(); // set i
        int filp_num = 0; // track i
        int[][] arr = new int[size][size];

        while (filp_num != i) {
            for (int k = filp_num; k < size; k++) {
                arr[i - 1][k] = 1;
                arr[k][i - 1] = 1;
            }

            for (int k = 0; k < size; k++) {
                for (int h = 0; h < size; h++) {
                    if (arr[k][h] == 1) {
                        arr[k][h] = 0;
                    } else {
                        arr[k][h] = 1;
                    }
                }
            }

            filp_num++;
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
