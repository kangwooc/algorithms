import java.util.ArrayList;
import java.util.Scanner;

// adjacency list
public class virus {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nV = sc.nextInt();
        int nE = sc.nextInt();

        ArrayList<ArrayList<Integer>> ad = new ArrayList();
        for (int i = 0; i < nV; i++) {
            ad.add(new ArrayList<>());
        }

        for (int i = 0; i < nE; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            ad.get(t1).add(t2);
            ad.get(t2).add(t1);
        }
        bfs(1);
        System.out.println(count);
        sc.close();
    }

    private static void bfs(int root) {

    }
}
