package course7;

import java.util.Scanner;

public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll(" ", ""));
    }
}
