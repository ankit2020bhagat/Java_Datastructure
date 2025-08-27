import java.util.*;

public class SecondLargestElelemt {

    static int secondlargestelement(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        return arr[n - 3];

    }

    public static void main(String[] args) {
        int[] arr = { 34, 45, 67, 89, 65 };
        int data = secondlargestelement(arr);

        System.out.println("data " + data);
    }

}
