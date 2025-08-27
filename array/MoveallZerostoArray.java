
public class MoveallZerostoArray {

    static void moveallzeros(int[] arr) {
        int n = arr.length;

        int[] temp = new int[n];

        int i = 0, j = 0;

        while (i < n) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        for (int k = j; k < n; k++) {
            arr[k] = 0;
        }

        for (int l = 0; l < n; l++) {
            System.out.print(arr[l] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 67, 3, 67, 0, 8, 0, 2, 0 };

        moveallzeros(arr);
    }
}
