import java.util.*;

public class Leadersinanarray {

    static ArrayList<Integer> leadersinArray(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                for( j=i;j<n-1;j++){
                    if(arr[j]>arr[j+1]){
                        break;
                    }
                    // 
                }
                result.add(arr[j]);
                i=j;
            }
        }
        result.add(arr[arr.length-1]);
        return result;

    }
    public static void main(String[] args) {
        int[] arr ={16, 17, 4, 3, 5, 2};
        
        ArrayList<Integer> result=leadersinArray(arr);
        
    for (int res : result) {
            System.out.print(res + " ");
        }
        
    }
}
