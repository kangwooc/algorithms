package course7;

import java.util.Scanner;

public class str3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }
}
