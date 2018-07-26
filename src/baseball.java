import java.util.Scanner;

public class baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] strike = new int[n];
        int[] ball = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }
        int answer = numCompare(nums, strike, ball);
        System.out.println(answer);
    }

    private static boolean figureOut(int num, int num1, int strike, int ball) {
        int[] digit = new int[3];
        digit[0] = num % 10;
        digit[1] = num / 10 % 10;
        digit[2] = num / 100;
        int[] digit1 = new int[3];
        digit1[0] = num1 % 10;
        digit1[1] = num1 / 10 % 10;
        digit1[2] = num1 / 100;

        for (int i = 0; i < digit1.length; i++) {
            if (digit1[i] == 0) {
                return false;
            }
        }
        if (digit1[0] == digit1[1] || digit1[1] == digit1[2] || digit1[0] == digit1[2]) {
            return false;
        }

        int strike1 = countStrike(digit[0], digit[1], digit[2], digit1[0], digit1[1], digit1[2]);
        int ball1 = countBall(digit[0], digit[1], digit[2], digit1[0], digit1[1], digit1[2]);
        if (strike != strike1 || ball != ball1) {
            return false;
        }
        return true;
    }

    private static int countStrike(int i, int i1, int i2, int i3, int i4, int i5) {
        int count = 0;
        if (i == i3) {
            count++;
        }
        if (i1 == i4) {
            count++;
        }
        if (i2 == i5) {
            count++;
        }
        return count;
    }

    private static int countBall(int i, int i1, int i2, int i3, int i4, int i5) {
        int count = 0;
        if (i != i3 && (i == i4 || i == i5)) {
            count++;
        }
        if (i1 != i4 && (i1 == i3 || i1 == i5)) {
            count++;
        }
        if (i2 != i5 && (i2 == i3 || i2 == i4)) {
            count++;
        }
        return count;
    }

    private static int numCompare(int[] num, int[] strike, int[] ball) {
        int answer = 0;
        for (int k = 123; k <= 987; k++) {
            int count = 0;
            for (int i = 0; i < num.length; i++) {
                if (figureOut(num[i], k, strike[i], ball[i])) {
                    count++;
                }
            }
            if (num.length == count) {
                answer++;
            }
        }
        return answer;
    }
}