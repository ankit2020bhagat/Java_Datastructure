package java_datastructure.string;

public class Allsubstrings {

    static void allsubString(String str1){
        
        for(int i=0;i<str1.length();i++){
            String str ="";
            for(int j=i;j<str1.length();j++){
                str +=str1.charAt(j);
                System.out.println(str);
            }
        }

    }
    public static void main(String[] args) {
        String str1 ="abc";
        allsubString(str1);
    }
}
