import java.util.HashSet;
public class LongestSubstringWoRepeatingChar {
    public static int lengthOfLongestSubstring(String s){

        //Stores unique characters in the current window 
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;   //left pointer of the window
        int right = 0;  //right pointer of the window
        int maxLength = 0;  //stores the maximum length found

        //Expand the window using the right pointer
        for(right = 0; right<s.length();right++){

            //stores the current character
            char ch = s.charAt(right);

            //as long as the window is valid, keep shrinking it from the left
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            //add the current character after the window becomes valid. (which is at the right)
            set.add(ch);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "abbbbac";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
