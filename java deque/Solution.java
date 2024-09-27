    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
    
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
            }
            List<Integer> list = new ArrayList<>(deque);
            List<Integer> unique = new ArrayList<>();
            if(n==m) {
                 Set<Integer> set = new HashSet<>(list);
                 unique.add(set.size());
                 System.out.println(Collections.max(unique));
                 return;
            }
            
            if(deque.size()<m){
                return;
            }
            
            for(int i=0; i<=n-m; i++){
                HashSet<Integer> set = new HashSet<>(list.subList(i, i+m));
                unique.add(set.size());
            }
            
            System.out.println(Collections.max(unique));
        }
    }



