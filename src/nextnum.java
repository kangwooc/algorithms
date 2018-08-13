
import java.util.Arrays;
import java.util.Scanner;

public class nextnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int[] zeros = new int[]{0, 0, 0};
        while (sc.hasNextInt()) {
            num[0] = sc.nextInt();
            num[1] = sc.nextInt();
            num[2] = sc.nextInt();
            if (Arrays.equals(num, zeros)) {
                break;
            } else {
                StringBuilder sb = new StringBuilder();
                if (((num[0] + num[2]) / 2) == num[1]) {
                    sb.append("AP ");
                    sb.append((num[2] + (num[2] - num[1])));
                } else if ((num[0] * num[2]) == num[1] * num[1]){
                    sb.append("GP ");
                    sb.append((num[2] * (num[2] / num[1])));
                }
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
