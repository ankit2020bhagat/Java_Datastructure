
public class Countofsubstrings {

    static Integer countsubSring(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "00100100101";
        int res = countsubSring(str);
        System.out.println(res);
    }
}
