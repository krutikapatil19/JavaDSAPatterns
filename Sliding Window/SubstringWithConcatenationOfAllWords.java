import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public static List<Integer> findSubstring (String s1, String[] words){

        //store answer indices
        List<Integer> result = new ArrayList<>();

        //edge case
        if(s1.length()== 0|| words.length == 0) return result;

        //length of each word
        int wordLen = words[0].length();

        //total number of words
        int wordCount = words.length;

        //need -> stores frequency of given words
        Map<String, Integer>need = new HashMap<>();

        //fill need map
        for(String word: words){
            need.put(word, need.getOrDefault(word, 0) + 1);
        }

        //try starting from different offsets(0 to wordLen - 1)
        for(int i = 0; i< wordLen; i++) {

            //sliding window logic 
            int left = i;       //start of window 
            int right = i;      //end of window

            //window -> stores current words in window
            Map<String, Integer> window = new HashMap<>();

            int count = 0;  //number of valid words matched
        
            //move right pointer in steps of wordLen
        while(right + wordLen <= s1.length()){

            //take word of size wordLen
            String word = s1.substring(right, right + wordLen);

            //move right forward
            right += wordLen;

            //if word is valid 
            if(need.containsKey(word)){

            //add word to window
            window.put(word, window.getOrDefault(word, 0) + 1);
            count ++;

            //Shrink window if word appears extra times 
            while(window.get(word) != null && window.get(word) > need.get(word)){

                String leftWord = s1.substring(left, left+ wordLen);

                //remove from window
                window.put(leftWord, window.get(leftWord) - 1);
                count--;

                //move left forward
                left += wordLen;
            }
            //if all words matched -> store index
            if(count == wordCount){
                result.add(left);
            }
        } else {
            //reset window if invalid word found
            window.clear();
            count = 0;
            left = right;
        }
    }
}
    return result;
    }
    public static void main(String[] args){
        String s1 = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        System.out.println(findSubstring(s1, words));
    }
}