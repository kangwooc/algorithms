import java.util.Scanner;

public class mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = mountain(n);
        System.out.println(s);
    }

    private static String mountain(int num) {
        if (num < 1) return "";
        return mountain(num - 1) + String.valueOf(num) + mountain(num - 1);
    }

}
