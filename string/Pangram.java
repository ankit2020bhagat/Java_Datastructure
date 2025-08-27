package java_datastructure.string;

public class Pangram {

    static boolean pangram(String str){
        int iMAXcount = 26;
        boolean[] fre=new boolean[iMAXcount];
         for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
              fre[ch-'a']= true;
            }
            else if (ch>='A' && ch <='Z'){
                fre[ch-'A']= true;
            }
         } 

         for(int i=0;i<iMAXcount;i++){
            if(!fre[i]){
                return false;
            }
         }
         return true;
    }
    
    public static void main(String[] args) {
       String str = "The quick brown fox jumps over the layz dog";
      boolean res= pangram(str);
      System.out.println(res);
    }
}
