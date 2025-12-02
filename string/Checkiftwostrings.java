
public class Checkiftwostrings {

    public static boolean check(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String str1 = "Ankit";
        String str2 = "Ankit";

        Boolean res = check(str1, str2);
        System.out.println(res);
    }

}
