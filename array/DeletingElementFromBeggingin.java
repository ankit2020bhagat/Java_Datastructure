
public class DeletingElementFromBeggingin {

    public static void main(String[] args) {
        // ArrayList<Integer> Arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // System.out.println("Before Deleting");

        // for (int i = 0; i < Arr1.size(); i++) {
        // System.out.print(Arr1.get(i) + " ");
        // }
        // Arr1.remove(0);

        // System.out.println("After deleting");
        // for (int i = 0; i < Arr1.size(); i++) {
        // System.out.print(Arr1.get(i) + " ");
        // }

        int arr1[] = { 1, 2, 3, 4, 5 };

        int n = 4;

        for (int i = 0; i < n; i++) {
            arr1[i] = arr1[i + 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + " ");
        }

    }

}
