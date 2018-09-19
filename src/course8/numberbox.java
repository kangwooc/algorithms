package course8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// use bufferreader when the number of input is a lot!
// counting sort

public class numberbox {
    static int n1, n2;
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        n1 = Integer.parseInt(sc.readLine());
        String[] num1 = sc.readLine().split(" ");
        for (int i = 0; i < n1; i++) { // => O(N)
            int n = Integer.parseInt(num1[i]);
            set.add(n); // O(N)
        }
        n2 = Integer.parseInt(sc.readLine());
        String[] num2 = sc.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            if (set.contains(Integer.parseInt(num2[i]))) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
