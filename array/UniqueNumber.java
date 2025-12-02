
import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {

    public static int findUnique(int[] arr) {

        HashMap<Integer, Integer> cnt = new HashMap<>();

        for (int num : arr) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entity : cnt.entrySet()) {
            if (entity.getValue() == 1) {
                return entity.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 4, 5, 3, 4 };

        int res = findUnique(arr);
        System.out.println("res " + res);

    }
}
