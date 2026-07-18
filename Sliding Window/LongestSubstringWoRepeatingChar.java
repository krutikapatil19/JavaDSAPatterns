import java.util.HashSet;
public class LongestSubstringWoRepeatingChar {
    public static int lengthOfLongestSubstring(String s){

        HashSet<Character> set = new HashSet<>;
        int left = 0;
        int right = 0;
        int maxLength = 0;

        for(left = 0; left<s.length();left++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                right++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "abbbbac";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
