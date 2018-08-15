package course4;

import java.util.ArrayList;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (num != 0) {
            arr.add(num % 2);
            num /= 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = arr.size() - 1; i >=0; i--) {
            sb.append(arr.get(i));
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
