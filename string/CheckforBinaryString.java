package java_datastructure.string;

public class CheckforBinaryString {
    static boolean checkforBinary(String str){
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!='0' && str.charAt(i) != '1'){
            return false;
           }
        
          
          
        }
         return true;
    }
    public static void main(String[] args) {
        String str1 ="as1010101010";
        boolean res = checkforBinary(str1);
        System.out.println("res "+res);
    }
}
