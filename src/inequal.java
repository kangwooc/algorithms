import java.util.Scanner;

public class inequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] ch = new char[num];
        boolean[] visited = new boolean[10];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        bfs(num, ch, visited);
        sc.close();
    }

    private static void bfs(int num, char[] ch, boolean[] visited) {

    }
}
