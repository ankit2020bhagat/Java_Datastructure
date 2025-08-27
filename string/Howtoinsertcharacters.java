package java_datastructure.string;

public class Howtoinsertcharacters {
    static String howtoinstert(String str,int[] arr){
        StringBuffer newStr = new StringBuffer();
        // String newStr ="";
        int j=0;
        for(int i=0;i<str.length();i++){
            if(j<arr.length && i == arr[j]){
                newStr.append("*");
                j++;

            }
            newStr.append(str.charAt(i));
        }
        // System.out.println(newStr.toString());
        return newStr.toString();

        }
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        int[] arr = {1, 5, 7, 9};
        String res = howtoinstert(str1, arr);
        System.out.println(res);
        
    }
}
