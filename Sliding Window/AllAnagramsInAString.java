import java.util.ArrayList;
import java.util.List;
public class AllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p){

        //store all starting indices
        List<Integer> result = new ArrayList<>();

        //edge case
        if(s.length() < p.length()) return result;

        //need -> freq of p
        int[] need = new int[26];
        //window -> freq of current window in s
        int[] window = new int[26];

        //fill need array
        for(char c: p.toCharArray()){
            need[c-'a']++;
        }

        int k = p.length(); //window size 

        //build first window 
        for(int i = 0;i<k;i++){
            window[s.charAt(i) - 'a']++;
        }

        //check first window 
        if(matches(need, window)){
            result.add(0);
        }

        //slide window 
        for(int i = k; i< s.length(); i++){
            //add

            window[s.charAt(i) - 'a']++;

            //remove
            window[s.charAt(i - k) - 'a']--;

            //check match
            if(matches(need, window)){
                result.add(i-k+1);
            }
        }
            
        return result;
    }
    public static boolean matches(int[] a, int[] b) {
                for(int i = 0; i<26; i++){
                    if(a[i] != b[i]) return false;
                }
                return true;
            
        }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
