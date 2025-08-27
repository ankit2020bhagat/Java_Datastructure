public class InsertElementAtBeggining {

    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // int element = 50;

        // System.out.println("Before inserting element");
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i) + " ");
        // }
        // arr.add(0, element);
        // System.out.println("After Inserting elelemt");
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i));
        // }

        int arr1[] = { 1, 2, 3, 4, 0 };
        int n = 4;
        int elelemt = 50;
        for (int i = 0; i < n; i++) {
            arr1[n - i] = arr1[n - i - 1];
        }
        arr1[0] = elelemt;

        System.out.println("After Inserting elelemt");
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]);
        }
    }

}
