import java.util.ArrayList;
import java.util.List;
public class AllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p){

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

        if(matches(need, window)){
            result.add(0);
        }

        for(int i = k; i< s.length(); i++){
            //add

            window[s.charAt(i) - 'a']++;

            //remove
            window[s.charAt(i - k) - 'a']--;

            //check match
            if(matches(need, window)){
                result.add(i-k+1);
            }

            public boolean matches(int[] a, int[] b) {
                for(int i = 0; i<26; i++){
                    if(a[i] != b[i]) return false;
                }
                return true;
            }
        }
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
