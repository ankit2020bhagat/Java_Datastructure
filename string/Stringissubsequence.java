public class Stringissubsequence {

    public static boolean checkSubsequences(String str1, String str2) {

        int preIndex = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if (j < preIndex) {
                        System.out.println(preIndex + " " + j);
                        return false;
                    }
                    preIndex = j;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str2 = "geeksforgeeks";
        String str1 = "gksrek";
        System.out.println(checkSubsequences(str1, str2));
    }
}
