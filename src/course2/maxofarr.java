package course2;

import java.util.Scanner;

public class maxofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                array[i][k] = sc.nextInt();
            }
        }

        int row = 0;
        int column = 0;
        int max = array[row][column];

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                if (array[i][k] > max) {
                    max = array[i][k];
                    row = i;
                    column = k;
                }
            }
        }

        System.out.println(max);
        System.out.println((row + 1) + " " + (column + 1));
        sc.close();
    }
}
