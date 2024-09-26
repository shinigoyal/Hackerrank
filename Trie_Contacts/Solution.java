import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    public static List<Integer> contacts(List<List<String>> queries) {
    List<Integer> list = new ArrayList<>();
    TrieNode root = new TrieNode();
    for(int i=0; i< queries.size(); i++){
            String op = queries.get(i).get(0);
            String name = queries.get(i).get(1);
            if(op.equals("add")){
               insertChar(root, name);
            }else{
               long count = (long)searchStr(root, name);
               list.add((int) count);
            }
    }
    return list;
    }
    
    static void insertChar(TrieNode root, String str){
            TrieNode curr = root;
            for(char c: str.toCharArray()){
                if(curr.nodes[c-'a']==null){
                    TrieNode newNode = new TrieNode();
                    newNode.nameCount = newNode.nameCount+1;
                    curr.nodes[c-'a']=newNode;
                }else {
                    curr.nodes[c-'a'].nameCount = curr.nodes[c-'a'].nameCount+1;
                }
                curr = curr.nodes[c-'a'];
            }
            curr.wordEnd  = true;
        }
    
    static int searchStr(TrieNode root, String str) {
            for (char c : str.toCharArray()) {
                if (root.nodes[c - 'a'] != null) {
                    root = root.nodes[c - 'a'];
                } else {
                    return 0;
                }
            }
            
            
            return root.nameCount;
        }

    
    
    static int searchDeeper(TrieNode root, int count) {
        for (int i=0; i< root.nodes.length; i++) {
            if (root.nodes[i] != null) {
                if (root.nodes[i].wordEnd) {
                    count++;
                }
                count = searchDeeper(root.nodes[i], count);
            }
        }
        return count;
    }


}

class TrieNode{
        TrieNode[] nodes;
        boolean wordEnd = false;
        int nameCount=0;
        public TrieNode(){
            nodes = new TrieNode[26];
        }     
}
    
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.contacts(queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
