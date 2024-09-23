import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here
     int swap = 0;
    for(int i=0; i< a.size() ; i++){
       
        for(int j =0; j< a.size()-1; j++){
            if(a.get(j)>a.get(j+1)){
                swap(a, j, j+1);
                swap++;
            }
        }

    }
    System.out.println("Array is sorted in "+swap+ " swaps.");
    System.out.println("First Element: " + a.get(0));
    System.out.println("Last Element: " + a.get(a.size()-1));

    }
    public static void swap(List<Integer> a, int ind1, int ind2){
        int temp = a.get(ind1);
        a.set(ind1, a.get(ind2));
        a.set(ind2, temp);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
