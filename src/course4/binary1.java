package course4;

import java.util.Scanner;

public class binary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        binaryMaker(sb, num);
        System.out.println(sb.reverse().toString());
    }

    private static void binaryMaker(StringBuilder sb, int num) {
        sb.append(num % 2);
        if (num / 2 == 0) return;
        binaryMaker(sb, num / 2);
    }
}
