package java_datastructure.string;
import java.util.*;
public class Camelcaseofagivensentence {
    static void camelCase(String s){
    
        ArrayList<String> worldList  = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (int i=1;i<worldList.size();i++){
            String newStr =worldList.get(i);
            System.out.println(Character.toUpperCase(newStr.charAt(0)));
        }
     }
    
     public static void main(String[] args) {
        String str ="Ankit kumar bhagat";
        camelCase(str);
     }
       
}


