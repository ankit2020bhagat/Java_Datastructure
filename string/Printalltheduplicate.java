package java_datastructure.string;
import java.util.HashMap;
public class Printalltheduplicate {
    static void printallduplicate(String str){
        HashMap<Character,Integer>freq = new HashMap<>();
        for(char c:str.toCharArray()){
             freq.put(c,  freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
    }
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        printallduplicate(str1);
    }
}
