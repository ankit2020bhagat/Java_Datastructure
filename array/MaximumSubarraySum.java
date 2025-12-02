public class MaximumSubarraySum {

    public static void maximumSum(int[] arr) {
        int max = -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (max < sum) {
                    max = sum;
                }
                // System.out.println(sum);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        maximumSum(arr);
    }
}
