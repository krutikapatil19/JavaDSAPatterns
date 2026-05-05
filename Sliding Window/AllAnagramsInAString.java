import java.util.ArrayList;
import java.util.List;
public class AllAnagramsInAString {
    public static List<String> findAnagrams(String s, String p){

        List<Integer> result = new ArrayList<>();

        if(s.length() < p.length()) return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for(char c: p.toCharArray()){
            need[c-'a']++;
        }

        int k = p.length();

        for(int i = 0;i<k;i++){
            window[s.charAt(i) - 'a']++;
        }
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
