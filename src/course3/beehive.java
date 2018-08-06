package course3;
// 1st : 1 1개
// 2nd : 2 ~ 7 6개 6 * 1
// 3rd : 8 ~ 19 -> 12개
// 4th : 20 ~ 37 -> 18개
// 5th: 38 ~ 61 -> 24
import java.util.Scanner;

public class beehive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int base = 1;
        int route = 1;
        while (base + (6 * route) < room) {
            base += (6 * route);
            route++;
        }
        System.out.println(route);

    }
}
