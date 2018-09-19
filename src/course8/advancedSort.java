package course8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class advancedSort {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        String[] arr = in.readLine().split(" ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        sort(nums, 0, size - 1);
        String s = Arrays.toString(nums).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
        System.out.println(s);
        in.close();
    }

    private static void merge(int[] nums, int left, int right) {
        int middle = (left + right) / 2;
        int n1 = middle - left + 1;
        int n2 = right - middle;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; i++) {
            L[i] = nums[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = nums[middle + 1 + i];
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                nums[k] = L[i];
                i++;
            }
            else
            {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            nums[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
    private static void sort(int arr[], int l, int r) {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, r);
        }
    }

}