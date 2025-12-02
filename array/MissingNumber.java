import java.util.Arrays;

public class MissingNumber {

    public static int findMissing(int[] arr) {

        Arrays.sort(arr);
        // for (int data : arr) {
        // System.out.println(data);
        // }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                return arr[i] + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };
        int res = findMissing(arr);
        System.out.println("res :" + res);

    }
}
