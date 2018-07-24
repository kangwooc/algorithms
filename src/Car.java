import java.util.*;

public class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] cars = new int[5];
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            cars[i] = sc.nextInt();
        }

        for (int i = 0; i < cars.length; i++) {
            if (d == cars[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
