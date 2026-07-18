import java.util.HashSet;
public class LongestSubstringWoRepeatingChar {
    public static int lengthOfLongestSubstring(String s){

        HashSet<Character> set = new HashSet<>;
        int left = 0;
        int right = 0;
        int maxLength = 0;

        for(right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left);
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "abbbbac";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
