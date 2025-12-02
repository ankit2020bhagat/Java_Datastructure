
import java.util.HashMap;

public class MissingandRepeating {

    public static void missingRepeating(int[] arr) {
        int repeating = -1;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int data : arr) {
            freq.put(data, freq.getOrDefault(data, 0) + 1);
        }
        for (int key : freq.keySet()) {
            if (freq.get(key) > 1) {
                repeating = key;
            }
        }
        System.out.println(repeating);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        missingRepeating(arr);
    }
}
