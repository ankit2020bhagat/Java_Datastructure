
public class SearchaCharacter {

    public static boolean search(String str1, char ch) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "Geeksforgeeks";
        boolean res = search(str1, 'g');
        System.out.println(res);
    }
}
