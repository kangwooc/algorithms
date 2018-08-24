import java.util.Scanner;

public class inequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] ch = new char[num];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
    }
}
