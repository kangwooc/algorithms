package course2;

import java.util.Scanner;

public class mine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int clicked_row = sc.nextInt();
        int clicked_column = sc.nextInt();
        int count = 0;
        int[][] arr = new int[row + 2][column + 2];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // fill out 0 at the edges! need to know!
        if (arr[clicked_row][clicked_column] == 1) {
            System.out.println("game over");
        } else {
            if (arr[clicked_row - 1][clicked_column - 1] == 1) {
                    count++;
            }
            if (arr[clicked_row - 1][clicked_column] == 1) {
                    count++;
            }
            if (arr[clicked_row - 1][clicked_column + 1] == 1) {
                count++;
            }
            if (arr[clicked_row][clicked_column - 1] == 1) {
                count++;
            }
            if (arr[clicked_row][clicked_column + 1] == 1) {
                count++;
            }
            if (arr[clicked_row + 1][clicked_column - 1] == 1) {
                count++;
            }
            if (arr[clicked_row + 1][clicked_column] == 1) {
                count++;
            }
            if (arr[clicked_row + 1][clicked_column + 1] == 1) {
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
