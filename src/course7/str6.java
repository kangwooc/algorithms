package course7;

import java.util.Scanner;

public class str6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (checkSubString(s1, s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    private static boolean checkSubString(String s1, String s2) {
        for (int i = 0; i <= s1.length() - 1; i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                if (s1.substring(i, j).equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
