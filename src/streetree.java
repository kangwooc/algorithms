import java.util.Scanner;

public class streetree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] gap = new int[n - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            gap[i] = arr[i + 1] - arr[i];
        }

        for (int i = 1; i < gap.length; i++) {
            gap[i] = gcd(gap[i], gap[i - 1]);
        }

        int count = 0;
        int k = 0;
        for (int i = arr[0]; i <= arr[n - 1]; i += gap[n - 1]) {
            if (i != arr[k]) {
                count++;
            } else {
                k++;
            }
        }
        System.out.println(count);
    }

    private static int gcd (int n1, int n2) {
        if (n2 % n1 == 0) {
            return n1;
        }
        return gcd(n2 % n1, n1);
    }
}
