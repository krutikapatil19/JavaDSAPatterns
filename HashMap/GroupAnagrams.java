import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupingAnagrams(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){

            String word = strs[i];

            char[]arr = word.toCharArray();

            Arrays.sort(arr);

            String sortedWord = new String(arr);

            if(map.containsKey(sortedWord)) {

                List<String>list = map.get(sortedWord);

                list.add(word);
             } else {
                List<String> list = new ArrayList<>();

                list.add(word);

                map.put(sortedWord, list);
                }
            }
             return new ArrayList<>(map.values());
        }
        public static void main(String[] args){
            String[] strs = {"cat","dog","god","rat","art","act"};
            System.out.println(groupingAnagrams(strs));
        }
}
