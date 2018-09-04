//package course7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextLine());
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
        sc.close();
    }
}
