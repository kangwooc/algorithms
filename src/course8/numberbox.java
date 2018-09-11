package course8;

import java.util.Scanner;

public class numberbox {
    static int n1, n2;
    static int[] box1, box2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        box1 = new int[n1];
        for (int i = 0; i < box1.length; i++) {
            box1[i] = sc.nextInt();
        }
        n2 = sc.nextInt();
        box2 = new int[n2];
        for (int i = 0; i < box2.length; i++) {
            box2[i] = sc.nextInt();
        }
    }
}
