package java_datastructure.string;

public class Insertacharacter {

    static String insertChar(String s,char c,int pos){
          StringBuilder str1 = new StringBuilder();
          
          for(int i=0;i<s.length();i++){
             if(i == pos){
                str1.append(c);
             }
             str1.append(s.charAt(i));
          }
          return str1.toString();
    }
    public static void main(String[] args) {
        String s1 ="ankit";
        String str1 = insertChar(s1, 'q', 2);
        System.out.println(str1);
    }
}
