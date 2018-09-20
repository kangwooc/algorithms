package course8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class parenthesisCal {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> chSt = new Stack<>();
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        char[] ch = in.readLine().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '[' || ch[i] == '(') {
                chSt.push(ch[i]);
            } else {
                if (ch[i] == ']' || ch[i] == ')') {
                    if (chSt.peek() == '[') {
                        st.push(3);
                        chSt.pop();
                    } else {
                        st.push(2);
                        chSt.pop();
                    }
                    if (st.empty()) {
                        op.push('+');
                    }
                }
            }
        }
        in.close();
    }
}
