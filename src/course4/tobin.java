package course4;
// step by step
// first: print out n numbers of binary number
// second: sort using condition
// third: optimization
// not use recursion...
import java.util.Scanner;

public class tobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int i = (1 << n) - 1;
        while (i >= 0) {
            int[] binarynums = new int[n];
            int length = Integer.toBinaryString(i).length();
            String binary = Integer.toString(i, 2);
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
            if (count == k) {
                int m = 0;
                if (length < n) {
                    for (int j = n - length; j < n; j++) {
                        if (m == length) {
                            break;
                        }
                        if (binary.charAt(m) == '1') {
                            binarynums[j] = 1;
                        }
                        m++;
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        if (m == length) {
                            break;
                        }
                        if (binary.charAt(m) == '1') {
                            binarynums[j] = 1;
                        }
                        m++;
                    }
                }
                for (int j = 0; j < binarynums.length - 1; j++) {
                    sb.append(binarynums[j]);
                }
                sb.append(binarynums[binarynums.length - 1] + "\n");
            }
            i--;
        }
        System.out.println(sb.toString());
        sc.close();
    }
}