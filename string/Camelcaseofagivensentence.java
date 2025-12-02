
public class Camelcaseofagivensentence {

    public static String convertCamelCase(String str) {

        StringBuilder res = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                flag = true;
            } else if (flag) {
                res.append(Character.toUpperCase(str.charAt(i)));
                flag = false;
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {

        String str = "ankit kumar";
        System.out.println(convertCamelCase(str));
    }

}
