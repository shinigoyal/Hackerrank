import java.io.*;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
    long count = 0;

        if (s.length() == 1 && s.toLowerCase().charAt(0) == 'a') {
            count = n;
        } else if (n < s.length()) {
            String subStr = s.substring(0, (int) n);
            count = subStr.length() - subStr.replace("a", "").length();
        }

        else {
            long part = n / s.length();
            count = s.length() - s.replace("a", "").length();
            
            int mod = (int) (n % part);
            if (mod == 0) {
                count = count * part;
            } else {
                String subs = s.substring(0, mod);
                count = count * part + (subs.length() - subs.replace("a", "").length());

            }

        }
        return count;
    
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
