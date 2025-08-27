
import java.util.*;

public class MaxixmiumProductTriplet {

    static int maxiumProductTriplet(int[] arr) {

        int n = arr.length;

        Arrays.sort(arr);

        return arr[n - 1] * arr[n - 2] * arr[n - 3];
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 10, 6, 20 };
        int data = maxiumProductTriplet(arr);

        System.out.println("data " + data);
    }

}
