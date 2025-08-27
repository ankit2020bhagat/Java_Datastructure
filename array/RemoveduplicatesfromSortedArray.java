
public class RemoveduplicatesfromSortedArray {
    static int removeDuplicate(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        int idx = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }

        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int newsize = removeDuplicate(arr);
        for (int j = 0; j < newsize; j++) {
            System.out.println(arr[j] + " ");
        }
    }

}
