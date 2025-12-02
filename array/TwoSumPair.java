import java.util.*;

public class TwoSumPair {

    static boolean binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;

    }

    public static boolean findPair(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (binarySearch(arr, i + 1, arr.length - 1, complement)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 1, 0, 5 };

        boolean bin = findPair(arr, 0);
        System.out.println("bin :" + bin);
    }
}
