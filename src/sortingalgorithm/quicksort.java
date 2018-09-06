package sortingalgorithm;

//성능은 최악의 경우 O(N^2)이고  최악의 경우를 제외하면  O(NlogN) 정도 됩니다.
// O(N^2)이 나오는 경우는 매우 희박하기 때문에 보통 O(NlogN)으로 취급합니다.
// 같은 NlogN이지만 합병 정렬보다는 두 배 빠르기 때문에 더 자주 쓰입니다.
//최악의 경우는 기준(pivot)으로 뽑은 수가 항상 제일 큰 수이거나 제일 작은 수일 경우입니다.
// 이럴 경우는 나중에 두 배열로 나누더라도 한 배열은 비어있고, 한 배열은 꽉 차있습니다.
import java.util.Arrays;

public class quicksort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 6, 4, 3, 7, 10, 8};
        System.out.println(Arrays.toString(arr));
        quicksort(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void partition(int[] arr) {

    }
    private static void quicksort(int[] arr) {

    }
}
