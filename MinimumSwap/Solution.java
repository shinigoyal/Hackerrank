import java.io.*;
import java.util.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swap = 0;
        
        int[] copyArr = new int[arr.length];
        for(int i = 0 ; i< arr.length; i ++){
            copyArr[i]=i+1;
        }
        
        for(int i = 0; i< arr.length; i++){
            
            if(copyArr[i] != arr[i]){
                for(int j = i+1 ; j <arr.length; j++){
                    if(copyArr[i] == arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        swap++;
                    }
                }
            }
        }
        
        
        
        return swap;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
