package course8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class numberBox1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        in.readLine();
        String[] num1 = in.readLine().split(" ");
        int[] arr1 = new int[num1.length];
        for (int i = 0; i < num1.length; i++) { // => O(N)
            arr1[i] = Integer.parseInt(num1[i]);; // O(1)
        }
        Arrays.sort(arr1);
        int minArr1 = arr1[0];
        int maxArr1 = arr1[arr1.length - 1];
        int[] count = countingSort(arr1, minArr1, maxArr1);

        in.readLine();
        String[] num2 = in.readLine().split(" ");
        int[] arr2 = new int[num2.length];
        for (int i = 0; i < num2.length; i++) { // => O(N)
            arr2[i] = Integer.parseInt(num2[i]);; // O(1)
        }

        int[] copyarr2 = Arrays.copyOf(arr2, arr2.length);
        Arrays.sort(copyarr2);
        int minArr2 = copyarr2[0];
        int maxArr2 = copyarr2[arr2.length - 1];
        for (int i = 0; i < arr2.length; i++) {
            if (maxArr2 > maxArr1 || minArr2 < minArr1) {
                System.out.println(0);

            } else {
                System.out.println(count[arr2[i] - minArr2]);
            }
        }
        in.close();
    }

    public static int[] countingSort(int[] a, int low, int high) {
        int[] counts = new int[high - low + 1]; // this will hold all possible values, from low to high
        for (int x : a)
            counts[x - low]++; // - low so the lowest possible value is always 0

        return counts;
    }
}

//    public static void countingSort(int[] a, int low, int high) {
//        int[] counts = new int[high - low + 1]; // this will hold all possible values, from low to high
//        for (int x : a)
//            counts[x - low]++; // - low so the lowest possible value is always 0
//
//        int current = 0;
//        for (int i = 0; i < counts.length; i++)
//        {
//            Arrays.fill(a, current, current + counts[i], i + low); // fills counts[i] elements of value i + low in current
//            current += counts[i]; // leap forward by counts[i] steps
//        }
//    }