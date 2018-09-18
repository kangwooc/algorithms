import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class advancedSort {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        String[] arr = in.readLine().split(" ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
    }

    private static void partition() {

    }

}
