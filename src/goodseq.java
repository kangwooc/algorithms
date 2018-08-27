import java.util.Scanner;

public class goodseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] num = new int[n];
        int x = 0;
        goodseq(x, num);
        sc.close();
    }

    private static void goodseq(int x, int[] num) {
        if (x >= num.length) {
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i]);
            }
            return;
        }




    }
}
