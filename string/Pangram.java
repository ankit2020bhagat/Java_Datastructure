
public class Pangram {

    static boolean pangram(String str) {
        boolean found = false;
        for (char ch = 'a'; ch <= 'z'; ch++) {

            for (int i = 0; i < str.length(); i++) {
                if (ch == Character.toLowerCase(str.charAt(i))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the dog";
        System.out.println(pangram(str));
    }
}
