package course7;

import java.util.Scanner;

public class str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = pressedStr(str);
        System.out.println(sb.toString());
        sc.close();
    }

    private static StringBuilder pressedStr(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        int count = 1;
        int i = 0;
        while (i < ch.length - 1) {
            if (ch[i] == ch[i + 1]) {
                count++;
            } else {
                sb.append(count);
                sb.append(ch[i]);
                count = 1;
            }
            i++;
        }
        sb.append(count);
        sb.append(ch[ch.length - 1]);
        return sb;
    }
}
