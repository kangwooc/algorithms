package course3;

import java.util.Scanner;

public class streetree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int initgap = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            initgap = gcd(arr[i] -  arr[i - 1], initgap);
        }

        int count = (arr[n - 1] - arr[0]) / initgap + 1 - n;
        System.out.println(count);
    }

    private static int gcd (int n1, int n2) {
        if (n2 % n1 == 0) {
            return n1;
        }
        return gcd(n2 % n1, n1);
    }
}
