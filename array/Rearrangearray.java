public class Rearrangearray {

    public static void rearrangeArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.printf(" " + i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        rearrangeArray(arr);
    }
}
