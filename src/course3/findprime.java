package course3;

import java.util.Scanner;

public class findprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i< nums.length; i++) {
            nums[i] = sc.nextInt();
        }


        int count = 0;
        for (int k = 0; k < nums.length; k++) {
            boolean flag = false;
            if (nums[k] == 1) {
                flag = true;
            } else {
                for (int i = 2; i <= nums[k] - 1; i++) {
                    if (nums[k] % i == 0) {
                        flag = true;
                    }
                }
            }
            if (flag == false) {
                count++;
            }
        }

        System.out.println(count);
    }
}
