package course7;
import java.util.Scanner;

public class str2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] -= 32;
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] += 32;
            }
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }
}
