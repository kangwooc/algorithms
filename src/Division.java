import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        division(n, sb);
        System.out.println(sb.toString());
        sc.close();
    }

    private static String division(int num, StringBuilder sb) {
        if (num == 0) return "";
        return "";
    }
}
