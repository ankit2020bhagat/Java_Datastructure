
public class Allsubstrings {

    public static int subString(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {

                for (int j = i; j < str.length(); j++) {
                    StringBuilder res = new StringBuilder();
                    for (int k = i; k <= j; k++) {
                        // System.out.print(str.charAt(k));
                        res.append(str.charAt(k));
                    }
                    // System.out.println(res.toString());
                    if (res.length() > 1) {
                        if (res.charAt(0) == '1' && res.charAt(res.length() - 1) == '1') {
                            count += 1;
                        }
                    }

                }
            }

        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String str = "00100101";
        subString(str);
    }
}
