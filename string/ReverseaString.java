package java_datastructure.string;

public class ReverseaString {

    static String reverseString(String str1){
        StringBuilder res = new StringBuilder();
        for(int i=str1.length()-1;i>=0;i--){
            res.append(str1.charAt(i));

        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str1 ="Ankit";
        String res = reverseString(str1);
        System.out.println("res "+res);
    }
}
