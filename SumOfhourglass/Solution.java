import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    List<Integer> hourGlassSum = new ArrayList<Integer>();
    for(int i =0 ; i < arr.size()-2; i++){
        
        for(int j = 0 ; j< arr.size()-2; j++){
            int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
            arr.get(i+1).get(j+1) + arr.get(i+2).get(j)+ arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
            hourGlassSum.add(sum);
        }
       
    }
     Collections.sort(hourGlassSum);
     return hourGlassSum.get(hourGlassSum.size()-1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
