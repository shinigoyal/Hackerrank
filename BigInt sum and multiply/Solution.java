import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        BigInteger bia = new BigInteger(a);
        BigInteger bib = new BigInteger(b);
        System.out.println(bia.add(bib));
        System.out.println(bia.multiply(bib));
        scan.close();
    }
}
