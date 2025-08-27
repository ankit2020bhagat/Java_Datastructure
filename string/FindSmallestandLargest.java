package java_datastructure.string;

import java.util.Arrays;

public class FindSmallestandLargest {

    static void findsmallandlargest(String str1){
        String[] str = str1.split(" ");
        String word=Arrays.toString(str);
        System.out.println(word.charAt(0));

            }
    public static void main(String[] args) {
       String sentence = "i got intern at geeksforgeeks";
       findsmallandlargest(sentence);

       

    }
}
