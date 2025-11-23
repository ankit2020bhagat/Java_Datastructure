public class SumofallSubarrays {

    public static void sumofallarrays(int[] arr) {

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                totalSum += sum;
            }

        }
        System.out.println("Total sum " + totalSum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 3, 2 };
        sumofallarrays(arr);
    }
}
