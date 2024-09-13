import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
         if(a.length()!=b.length()){
            return false;
        }
        
       a = a.toLowerCase();
       b = b.toLowerCase();
       
       boolean bool = true;
       while(!a.isEmpty() || !b.isEmpty()){
          a = a.replace(String.valueOf(b.charAt(0)), "");
          b = b.replace(String.valueOf(b.charAt(0)), ""); 
          if(a.length()!=b.length()){
              bool = false;
              break;
          }
       }
       return bool;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
