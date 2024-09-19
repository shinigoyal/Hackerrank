import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

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

        bufferedReader.close();
        hourglassSum(arr);
    }
    
   
   
   static void hourglassSum(List<List<Integer>> list) {
        int max = -999;
        for (int i = 0; i < list.size() - 2; i++) {
            for(int j = 0; j < list.size()-2 ; j++) {
                int sum = list.get(i).get(j) + list.get(i).get(j + 1) + list.get(i).get(j + 2) + list.get(i + 1).get(j + 1) + list.get(i + 2).get(j) + list.get(i + 2).get(j + 1) + list.get(i + 2).get(j + 2);
                if (sum > max) {
                    max = sum;
                }
            }
            
        }

        System.out.println(max);
    }
}
