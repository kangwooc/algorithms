import java.util.Scanner;

public class maxofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                array[i][k] = sc.nextInt();
            }
        }
        int row = 0;
        int column = 0;
        int max = array[row][column];

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (array[i][k] > max) {
                    max = array[i][k];
                    row = i;
                    column = k;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);

    }
}
