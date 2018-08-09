package course3;

import java.util.Scanner;

public class combinationzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int two = 0;
        int five = 0;
        for (int i = (n - m + 1); i <= n; i++) {
            int num = i;
            if (num % 2 == 0) {
                two++;
                num /= 2;
                while (num % 2 == 0) {
                    two++;
                    num /= 2;
                }
            }
            if (num % 5 == 0) {
                five++;
                num /= 5;
                while (num % 5 == 0) {
                    five++;
                        num /= 5;
                    }
                }
            }
            int tenfornum = 0;
            if (two == 0 || five == 0){
                System.out.println(tenfornum);
                return;
            }
            for (int i = 2; i <= m; i++) {
                int num = i;
                if (num % 2 == 0) {
                    two--;
                    num /= 2;
                    while (num % 2 == 0) {
                        two--;
                        num /= 2;
                    }
                }
                if (num % 5 == 0) {
                    five--;
                    num /= 5;
                    while (num % 5 == 0) {
                        five--;
                        num /= 5;
                    }
                }
            }
            if (two > five) {
                tenfornum = five;
            } else {
                tenfornum = two;
            }
            int count = tenfornum;
            if (count <= 0) {
                System.out.println(0);
            } else {
                System.out.println(count);
            }
    }
}