
public class Removealloccurrences {

    public static void remove(StringBuffer str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                str.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("geeksforgeeks");
        remove(str, 'e');

    }
}
