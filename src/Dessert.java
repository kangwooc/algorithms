import java.util.Scanner;
import java.util.Stack;

// postfix notation...

public class Dessert {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[2 * N - 1];
        char[] ch = {'+', '-', '.'};
        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }
        for (int i = N; i < nums.length; i++) {
            nums[i] = ch[0];
        }
        int x = nums.length - 1;
        dessert(nums, ch, N, x);
        System.out.println(count);
        sc.close();
    }

    private static void dessert(int[] nums, char[] ch, int N, int x) {
        if (postfix(nums, N) == 0) {
            if (count <= 20) {
                for (int i = 0; i < N - 1; i++) {
                    System.out.print(nums[i] + " ");
                    System.out.print((char) nums[N + i] + " ");
                }
                System.out.println(nums[N - 1]);
            }
            count++;
            return;
        }

        for (int j = 0; j < ch.length; j++) {
            if (x >= N) {
                nums[x] = ch[j];
                dessert(nums, ch, N, x - 1);
            }
        }
    }

    private static int postfix(int[] nums, int N) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= N) {
                s.push(nums[i]);
            } else {
                int n1 = s.pop();
                int n2 = s.pop();
                switch ((char) nums[i]) {
                    case '+':
                        s.push(n2 + n1);
                        break;
                    case '-':
                        s.push(n2 - n1);
                        break;
                        // input + ?????
                    case '.':
                        s.push(n2 * 10 + n1);
                        break;
                }
            }
        }
        return s.pop();
    }
}
