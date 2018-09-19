package course8;

import java.util.Scanner;
import java.util.Stack;

public class top {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> indexSt = new Stack<>();
        st.push(sc.nextInt());
        indexSt.push(1);
        sb.append("0 ");
        for (int i = 2; i <= num; i++) {
            int value = sc.nextInt();
            while (!st.empty()) {
                if (value < st.peek()) {
                    sb.append(indexSt.peek() + " ");
                    break;
                }
                st.pop();
                indexSt.pop();
            }
            if (st.isEmpty()) {
                sb.append("0 ");
            }
            st.push(value);
            indexSt.push(i);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}