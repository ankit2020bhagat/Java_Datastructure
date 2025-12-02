
import java.util.HashMap;

public class Frequency {

    public static void frequecy(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int data : arr) {
            freq.put(data, freq.getOrDefault(data, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + "->" + freq.get(key));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3 };
        frequecy(arr);

    }
}
