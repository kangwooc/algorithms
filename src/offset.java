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
            for (int k = 1; k < 4; k++) {
                if (twoArray[i][k] < twoArray[i][k - 1] && twoArray[i][k] < twoArray[i][k + 1]) {
                    twoArray1[i][k] = "*";
                } else {
                    twoArray1[i][k] = String.valueOf(twoArray[i][k]);
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(twoArray[i][k] + " ");
            }
            System.out.println(twoArray[i][4]);
        }
    }
}
