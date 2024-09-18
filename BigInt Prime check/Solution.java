import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        
        BigInteger bi = new BigInteger(n);
        if(bi.isProbablePrime(5)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
