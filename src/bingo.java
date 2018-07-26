import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                array1[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                array2[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                array2[i][k] = sc.nextInt();
            }
        }

    }
}
