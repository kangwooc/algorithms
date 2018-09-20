import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NNdan {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine());
        long M = Long.parseLong(sc.readLine());
        long[][] arr = new long[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = i * j;
            }
        } // O(N^2)
        List<Long> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                list.add(arr[i][j]);
            }
        } // O(N^2)
        Collections.sort(list);
        System.out.println(list.get((int) M));
        sc.close();
    }
}