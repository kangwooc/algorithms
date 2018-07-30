package course1;

import java.util.Scanner;

public class bingo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int size = 5;
        final int MAX = 5;
        int[][] array1 = new int[5][5];

        int called_num;
        int line;
        int call_cnt = 0;

        // 숫자 입력
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                array1[i][k] = sc.nextInt();
            }
        }
        // 번호 입력
        while (sc.hasNextInt()) {
            called_num = sc.nextInt();
            call_cnt++;

            for (int i = 0; i < size; i++) {
                for (int k = 0; k < size; k++) {
                    if (array1[i][k] == called_num) {
                        array1[i][k] = 0;
                    }
                }
            }

            // line count
            line = 0;
            int left_diag = 0;
            int right_diag = 0;
            for (int i = 0; i < size; i++) {
                int row_cnt = 0;
                int column_cnt = 0;
                for (int k = 0; k < size; k++) {
                    if (array1[i][k] == 0) {
                        row_cnt++;
                    }
                    if (array1[k][i] == 0) {
                        column_cnt++;
                    }
                }
                if (row_cnt == MAX) {
                    line++;
                }
                if (column_cnt == MAX) {
                    line++;
                }
                if (array1[i][i] == 0) {
                    left_diag++;
                }
                if (array1[i][MAX - i - 1] == 0) {
                    right_diag++;
                }

            }
            if (left_diag == MAX) {
                line++;
            }
            if (right_diag == MAX) {
                line++;
            }

            if (line >= 3) {
                sc.close();
                System.out.println(call_cnt);
                break;
            }
        }


    }
}
