import java.util.Scanner;

// N 자리 K 진수 구하기
// subset problem.....
public class NK {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        findNandK(k,0, n, nums);
    }

    private static void findNandK(int k, int x, int n, int[] nums) {
        if (x >= n) {
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i]);
            }
            System.out.println();
            count++;
            return;
        }

        for (int i = k - 1; i >= 0; i--) {
            nums[x] = i;
            findNandK(k, x + 1, n, nums);
        }
    }
}
