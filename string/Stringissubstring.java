package java_datastructure.string;

public class Stringissubstring {

    static boolean checkSubString(String str,String subString){
        int i=0;
        boolean flag =true;
        while(i<str.length()){
            int j=0;
            if(j<subString.length() && str.charAt(i) == subString.charAt(j)){
               while (j<subString.length()) {
                if(str.charAt(i) !=subString.charAt(j)){
                    flag = false;
                   break;

                }
                i++;j++;
               }
            }
            i++;
        }
        return flag;
        
       
    }
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String subString ="eks";
        boolean res = checkSubString(str1, subString);
        System.out.println(res);
    }
}
