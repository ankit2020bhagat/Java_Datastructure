import java.util.ArrayList;

public class RearrangeArrayElementsbySign {
    static void rearrangeArrayElement(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        int j = 0, p = 0, n = 0;
        while (j < arr.length) {
            if (p < positive.size()) {
                arr[j] = positive.get(p);
                p++;
                j++;
            }
            if (n < negative.size()) {
                arr[j] = negative.get(n);
                n++;
                j++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, -1, 4 };
        rearrangeArrayElement(arr);
    }
}