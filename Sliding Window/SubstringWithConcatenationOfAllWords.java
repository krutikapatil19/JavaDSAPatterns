import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public static List<Integer> findSubstring (String s1, String[] words){

        List<Integer> result = new ArrayList<>();

        if(s1.length()== 0|| words.length == 0) return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        //int totalLen = wordLen * wordCount;

        Map<String, Integer>need = new HashMap<>();

        for(String word: words){
            need.put(word, need.getOrDefault(word, 0) + 1);
        }

        for(int i = 0; i< wordLen; i++) {
            //sliding window logic 
            int left = i;
            int right = i;

            Map<String, Integer> window = new HashMap<>();

            int count = 0;
        
        while(right + wordLen <= s1.length()){

            String word = s1.substring(right, right + wordLen);

            right += wordLen;

            if(need.containsKey(word)){
                window.put(word, window.getOrDefault(word, 0) + 1);
                count ++;

            //Shrink
            while(window.get(word) > need.get(word)){

                String leftWord = s1.substring(left, left+ wordLen);
                window.put(leftWord, window.get(leftWord) - 1);
                count--;
                left += wordLen;
            }
            //valid case
            if(count == wordCount){
                result.add(left);
            }
        } else {
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