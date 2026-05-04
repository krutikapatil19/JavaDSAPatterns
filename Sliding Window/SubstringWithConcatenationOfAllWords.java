import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring (String s1, String[] words){

        List<Integer> result = new ArrayList<>();

        if(s1.length()== 0|| words.length == 0) return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        Map<String, Integer>need = new HashMap<>();

        for(int i = 0; i< wordLen; i++) {
            //sliding window logic 
        }

    } 
    public static void main(String[] args){
        String s1 = "barfoothefoobarman";
        String[] words = ["foo","bar"];

        System.out.println(findSubstring(s1, words));
    }
}