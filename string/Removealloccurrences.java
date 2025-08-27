package java_datastructure.string;

public class Removealloccurrences {

    static String removeallOccurence(String s,char c){
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c){
                str.deleteCharAt(i);
                i--;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "Geeksforgeeks";
        char ch ='e';
        String str1 =removeallOccurence(s,ch);
        System.out.println("str1 "+str1);
    }
}
