import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            List<Integer> innerList = new ArrayList<>();
            int count = scan.nextInt();
            for(int j = 0; j<count; j++){
                innerList.add(scan.nextInt());
            }
            list.add(innerList);
        }
        int queries = scan.nextInt();
        for(int i=0; i<queries; i++){
            int lineAt = scan.nextInt();
            int position = scan.nextInt();
            try{
                System.out.println(list.get(lineAt-1).get(position-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
        
    }
}
