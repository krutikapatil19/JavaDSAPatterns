import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupingAnagrams(String [] strs ){

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){

            String word = strs[i];

            //convert to char arr

            //sorting the char arr

            //convert back to string

            String sortedWord = ?;

            if(map.containsKey(sortedWord)) {

                //get existing list

                //add current word to the list
            } else {
                //create a new arrayList

                //add current word 

                //put sortedWord and list into map 
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = {"cat","dog","act","god"};
        System.out.println(groupingAnagrams(strs));
    }
}
