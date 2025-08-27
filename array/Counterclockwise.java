
public class Counterclockwise {

    static void counterClockwise(int[] arr, int k) {
        int n = arr.length;
        int[] arr2 = new int[n];

        int i = k, j = 0;

        while (i < n) {
            arr2[j] = arr[i];
            i++;
            j++;
        }
        for (int o = 0; o < k; o++) {

            arr2[j] = arr[o];
            j++;

        }

        for (int m = 0; m < n; m++) {
            System.out.print(arr2[m] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 34, 45, 67, 8, 90 };
        counterClockwise(arr, 2);

    }
}
