public class RemoveAllOccurrences {

    static int removeAlloccurence(int[] arr, int ele) {
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (ele != arr[i]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 3, 6, 3 };
        int data = removeAlloccurence(arr, 3);
        System.out.println("data " + data);
    }
}
