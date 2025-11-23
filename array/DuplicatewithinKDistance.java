
import java.util.HashSet;

public class DuplicatewithinKDistance {

    public static Boolean checkDeplicates(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (j - i <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Boolean checkDuplicatBoolean(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);

            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        Boolean res = checkDeplicates(arr, 3);
        System.out.println("res " + res);
        Boolean res1 = checkDuplicatBoolean(arr, 3);
        System.out.println("res1 " + res1);
    }
}
