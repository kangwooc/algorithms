package course8;

import java.io.*;
import java.util.HashSet;

// use bufferreader when the number of input is a lot!
// counting

public class numberbox {
    static int n1, n2;
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        n1 = Integer.parseInt(sc.readLine());
        String[] num1 = sc.readLine().split(" ");
        for (int i = 0; i < n1; i++) { // => O(N)
            int n = Integer.parseInt(num1[i]);
            set.add(n); // O(1)
        }
        n2 = Integer.parseInt(sc.readLine());
        String[] num2 = sc.readLine().split(" ");
        for (int i = 0; i < n2; i++) { // O(M)
            if (set.contains(Integer.parseInt(num2[i]))) {
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        // O(N+M)?????
        bw.write(sb.toString());
        bw.flush();
        sc.close();
    }
}
