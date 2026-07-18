import java.util.HashSet;
public class LongestSubstringWoRepeatingChar {
    public static int longestSubstring(String s){

        HashSet<Character> set = new HashSet()<>;
        int left = 0;
        int right = 0;

        for(int i = 0; i<s.length();i++){
            if(set.contains(ch)){
                right++;
            }else {
                set.add(ch);
            }
        }
    }
    public static void main(String[] args){
        String s = "abbbbac";
        System.out.println(longestSubstring(s));
    }
}
