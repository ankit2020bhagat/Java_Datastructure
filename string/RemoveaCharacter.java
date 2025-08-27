package java_datastructure.string;

public class RemoveaCharacter {

    static String removeChar(StringBuffer str1,int pos){
       for (int i = pos; i < str1.length() - 1; i++) {
            str1.setCharAt(i, str1.charAt(i + 1));
        }
        str1.deleteCharAt(str1.length()-1);
        return str1.toString();
    }
    public static void main(String[] args) {
        StringBuffer str1 =new StringBuffer("ankit");
        int pos =2;
        removeChar(str1, pos);
        System.out.println(str1);
    }
}
