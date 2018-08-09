package course3;

import java.util.Scanner;

public class chebyshevtheo {
    public static final int MAX = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] isPrime = new boolean[MAX+1];
        for(int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i <= MAX; i++) {
            for(int j = i * 2; j <= MAX; j += i) {
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }

        while(true) {
            int n = sc.nextInt();
            if(n == 0)
                break;
            int cnt = 0;
            for(int i = n+1; i <= 2*n; i++) {
                if(isPrime[i])
                    ++cnt;
            }
            System.out.println(cnt);
        }
    }
}
