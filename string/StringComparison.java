package java_datastructure.string;

public class StringComparison {

    public static boolean areStringSame(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        String s1 ="ankit";
        String s2 = "ankit";

        boolean res = areStringSame(s1, s2);
        System.out.println(res);
    }
}
