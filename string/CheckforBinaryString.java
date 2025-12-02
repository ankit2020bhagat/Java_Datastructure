
public class CheckforBinaryString {

    public static Boolean check(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        str.append("01010101010");

        System.out.println(check(str));
    }
}
