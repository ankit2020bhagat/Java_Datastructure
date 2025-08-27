package java_datastructure.string;

public class ConcatenationofTwoStrings {

    static String concateString(String str1,String str2){
        StringBuilder resStr = new StringBuilder();
        for(int i=0;i<str1.length();i++){
            resStr.append(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++){
            resStr.append(str2.charAt(i));
        }
        return resStr.toString();
    }
    public static void main(String[] args) {
        String str1 ="ankit";
        String str2 ="kumar";
        String res = concateString(str1, str2);
        System.out.println("res "+res);
    }
}
