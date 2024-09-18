import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i< count; i++){
            arr.add(scan.nextInt());
        }
        int operations = scan.nextInt();
        
        for(int i =0; i< operations; i++){
            
        String type = scan.next();
        if(type.equalsIgnoreCase("Insert")){
            int index = scan.nextInt();
            int number = scan.nextInt();
            if(index>=arr.size()){
                arr.add(number);  
            }else{
                arr.add(index, number);
            }
            
            
        }else{
            int index = scan.nextInt();
            arr.remove(index);
        }
        }
        
        for (int i=0;i<arr.size();i++){
                    System.out.print(arr.get(i) + " ");
        }
        scan.close();
    }
}
