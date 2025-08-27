public class Insertanadjacentduplicate {

    static void insertAdjacent(int[] arr, int ele) {
        int[] newArr = new int[arr.length];
        int j = 0, i = 0;
        while (i < arr.length && j < arr.length) {
            newArr[j] = arr[i];
            if (arr[i] == ele && j < arr.length) {
                newArr[j + 1] = ele;
                j++;
            }
            j++;
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(newArr[k]);
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 0, 2, 3, 0, 4, 5, 0 };
        insertAdjacent(arr1, 0);

    }
}
