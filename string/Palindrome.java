package java_datastructure.string;

public class Palindrome {

    static boolean palindrome(String str){
       int left =0,right = str.length()-1;

       while (left<right) {
        if(str.charAt(left)!=str.charAt(right)){
          return false;
        }
        right--;
        left++;
        
       }
       return true;
    }
    public static void main(String[] args) {
        String str1 ="abbc";
        boolean res=palindrome(str1);
        System.out.println(res);
    }
}
