import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupingAnagrams(String [] strs ){

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){

            String word = strs[i];

            //convert to char arr
            char[]arr = word.toCharArray();

            //sorting the char arr
            Arrays.sort(arr);

            //convert back to string
            String sortedWord =new String(arr);

            if(map.containsKey(sortedWord)) {

                //get existing list
                List<String>list = map.get(sortedWord);

                //add current word to the list
                list.add(word);
            } else {
                //create a new arrayList

                List<String> list = new ArrayList<>();
               
                //add current word 
                list.add(word);

                //put sortedWord and list into map 
                map.put(sortedWord,list);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = {"cat","dog","act","god"};
        System.out.println(groupingAnagrams(strs));
    }
}

/*This problem is based on HashMap+String Manipulation.
Key idea : Find a common key -> Store similar items together(Anagrams) -> HashMap<Key, List<Items>>
Group Anagrams : 
Sorted Word -> List of Anagrams
"aet" -> [eat,tea,ate]
*/
