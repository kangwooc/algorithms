import java.util.ArrayList;
import java.util.Scanner;

public class nextnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        int[][] nums = new int[3][3];

        while(sc.hasNextInt()) {

        }

        String[] X = new String[2];
        int next[] = new int[2];
        for (int i = 0; i < 2; i++) {
            if (((nums[i][0] + nums[i][2]) / 2) == nums[i][1]) {
                X[i] = "AP";
                next[i] = nums[i][2] + (nums[i][2] - nums[i][1]);

            } else if (((nums[i][0] * nums[i][2])) == nums[i][1] * nums[i][1]) {
                X[i] = "GP";
                next[i] = nums[i][2] * (nums[i][1] / nums[i][0]);

            }
        }

        for (int i = 0; i <= 1; i++) {
            System.out.println(X[i] + " "+ next[i]);
        }

    }
}
