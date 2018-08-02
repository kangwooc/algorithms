package course2;

import java.util.Scanner;

public class classpresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num + 1][7];

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int president = 0;
        int max = 0;
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int k = 1; k <= num; k++) {
                for (int j = 1; j <= 5; j++) {
                    if (arr[i][j] == arr[k][j] && k != i) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                president = i;
                max = count;
            }
        }
        if (president == 0) {
            System.out.println(1);
        } else {
            System.out.println(president);
        }
    }
}
