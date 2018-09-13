package leetcode;

import java.util.Arrays;

public class Q66 {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    public static int[] plusOne(int[] digits) {
        int k = 0;
        String s = new String();
        while (k < digits.length) {
            s += digits[k];
            k++;
        }
        long num = Long.valueOf(s) + 1;
        char[] chnum = String.valueOf(num).toCharArray();
        int[] nums = new int[chnum.length];
        for (int i = 0; i < chnum.length; i++) {
            nums[i] = Character.getNumericValue(chnum[i]);
        }
        return nums;
    }
}
