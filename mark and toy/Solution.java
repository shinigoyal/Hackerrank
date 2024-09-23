import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'maximumToys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY prices 2. INTEGER k
	 */

	static int maximumToys(List<Integer> prices, int k) {
		int[] arr = new int[prices.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = prices.get(i);
		}
		Arrays.sort(arr);
		int max = 0;
		for (int i : arr) {
			if (k >= i) {
				k -= i;
				max++;
			} else
				break;
		}
		return max;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Result.maximumToys(prices, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
