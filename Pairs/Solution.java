import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int pairs(int k, List<Integer> arr) {
    
    int[] array = new int[arr.size()];
    for(int i=0;i<arr.size(); i++){
        array[i]=arr.get(i);
    }
    Arrays.sort(array);
    int pair=0;
    for(int i =0 ;i<array.length-1; i++){
        for(int j =i+1 ;j<array.length; j++){
             if(array[j] - k ==array[i] || array[i]-k==array[j]){
                pair++;
             }else if(array[j] - k > array[i] || array[i]-k > array[j]){
                 break;
             }
        }
       
    }
    return pair;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
