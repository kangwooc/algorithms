package course8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = in.readLine().toCharArray();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                s.push(ch[i]);
            } else {
                if (s.empty()) {
                    System.out.println("NO");
                    return;
                }
                s.pop();
            }
        }
        if (!s.empty()) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        in.close();
    }
}
