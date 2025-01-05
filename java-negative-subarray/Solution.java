import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(isNegative(arr));
        }
    
    public static int isNegative(int[] subArr){
        
        int count =0;
        for(int i=0; i< subArr.length; i++){
            int sum = subArr[i];
            if(sum<0){
                count++;
            }
            for(int j=i+1 ; j< subArr.length; j++){
                   sum += subArr[j];
                   if(sum < 0){
                    count++;
                   }
            }
        }
        return count;
    }
    
}
