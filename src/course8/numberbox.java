package course8;

import java.util.HashSet;
import java.util.Scanner;

public class numberbox {
    static int n1, n2;
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            set.add(sc.nextInt());
        }

        n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            if (set.contains(sc.nextInt())) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
