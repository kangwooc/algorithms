package course8;

import java.util.Scanner;
import java.util.Stack;

public class histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();

        int  n = sc.nextInt();
        int a[] = new int[n+2];
        for(int i=1;i<=n;i++) a[i] = sc.nextInt();
        int ret = 0;
        s.push(0);
        for(int i=1;i<=n+1;i++){
            while(!s.isEmpty() && a[i]<a[s.peek()]){
                int idx = s.pop();
                ret = max(ret, a[idx]*(i-s.peek()-1));
            }
            s.push(i);
        }
        System.out.println(ret);
        sc.close();
    }
    static int max(int a,int b){
        return a > b ? a : b;
    }

}