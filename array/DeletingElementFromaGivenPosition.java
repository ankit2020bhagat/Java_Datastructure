
public class DeletingElementFromaGivenPosition {

    public static void main(String[] args) {
        // ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // int pos = 2;

        // arr1.remove(pos - 1);

        // for (int i = 0; i < arr1.size(); i++) {
        // System.out.println(arr1.get(i));
        // }

        int arr1[] = { 1, 2, 3, 4, 5 };
        int pos = 2;
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == pos - 1) {
                for (int j = i; j < n - 1; j++) {
                    arr1[j] = arr1[j + 1];
                }
            }

        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr1[i] + " ");
        }

    }

}
