import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] arr = s.split("[!,?.*_'@\\ ]+");
        
        System.out.println(arr.length);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}

