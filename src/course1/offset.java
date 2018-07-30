package course1;

import java.util.Scanner;

public class offset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] twoArray = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                twoArray[i][k] = sc.nextInt();
            }
        }

        String[][] twoArray1 = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                twoArray1[i][k] = String.valueOf(twoArray[i][k]);
                if (i == 0 || i == 4) {
                    if (k == 0 || k == 4) {
                        if (i == 0) {
                            if ((k == 0 && twoArray[i][k + 1] > twoArray[i][k] && twoArray[i + 1][k] > twoArray[i][k])
                                    || (k == 4 && twoArray[i][k - 1] > twoArray[i][k] && twoArray[i + 1][k] > twoArray[i][k])) {
                                twoArray1[i][k] = "*";
                            }
                        } else {
                            if ((k == 0 && twoArray[i][k + 1] > twoArray[i][k] && twoArray[i - 1][k] > twoArray[i][k])
                                    || (k == 4 && twoArray[i][k - 1] > twoArray[i][k] && twoArray[i - 1][k] > twoArray[i][k])) {
                                twoArray1[i][k] = "*";
                            }
                        }
                    } else {
                        if (i == 0) {
                            if (twoArray[i][k] < twoArray[i][k - 1] && twoArray[i][k] < twoArray[i][k + 1] && twoArray[i][k] < twoArray[i + 1][k]) {
                                twoArray1[i][k] = "*";
                            }
                        } else {
                            if (twoArray[i][k] < twoArray[i - 1][k] && twoArray[i][k] < twoArray[i][k + 1] && twoArray[i][k] < twoArray[i][k - 1]) {
                                twoArray1[i][k] = "*";
                            }
                        }
                    }
                } else {
                    if (k == 0 || k == 4) {
                        if ((k == 0 && twoArray[i][k + 1] > twoArray[i][k] && twoArray[i + 1][k] > twoArray[i][k] && twoArray[i - 1][k] > twoArray[i][k])
                                || (k == 4 && twoArray[i][k - 1] > twoArray[i][k] && twoArray[i - 1][k] > twoArray[i][k] && twoArray[i + 1][k] > twoArray[i][k])) {
                            twoArray1[i][k] = "*";
                        }
                    } else {
                        if (twoArray[i][k] < twoArray[i][k - 1] && twoArray[i][k] < twoArray[i][k + 1]
                                && twoArray[i][k] < twoArray[i - 1][k] && twoArray[i][k] < twoArray[i + 1][k]) {
                            twoArray1[i][k] = "*";
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(twoArray1[i][k] + " ");
            }
            System.out.println(twoArray1[i][4]);
        }
        sc.close();
    }
}
