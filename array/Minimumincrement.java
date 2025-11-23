public class Minimumincrement {

    public static int minIncrement(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("Max " + max);

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((max - arr[i]) % k != 0) {
                return -1;
            } else {
                res += (max - arr[i]) / k;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 7, 19, 16 };
        int k = 3;

        int res = minIncrement(arr, k);
        System.out.println("res " + res);

    }
}
