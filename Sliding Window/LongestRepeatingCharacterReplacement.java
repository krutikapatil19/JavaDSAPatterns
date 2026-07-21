import java.util.HashMap;
public class LongestRepeatingCharacterReplacement {
    public static int LongestCharReplacement(String s, int k){

        HashMap<Character,Integer>map = new HashMap<>();
        int left=0;
        int maxFreq = 0;    //highest freq of any character in current window
        int maxLength = 0;  //store the result

        //Expand the window using right pointer
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            
            //Increase freq of current character
            map.put(ch, map.getOrDefault(ch,0) + 1);

            //update max Frequency , if this count is the new highest (updating highest freq seen in this window)
            maxFreq = Math.max(maxFreq,map.get(ch));

            //current window size
            int windowLength = right - left + 1;

            //If more than k replacements are needed, that means the window is invalid -> shrink the window from left 
            while(windowLength - maxFreq > k){
                char leftChar = s.charAt(left);

                //decrease leftchar's count in the map (as the leftmost char is removed )
                map.put(leftChar, map.get(leftChar)-1);
                left++;

                //recalculate windowLength after shrinking
                windowLength =  right-left+1;
            }
            
            //store the maximum valid window length
            maxLength = Math.max(maxLength, windowLength);
          
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "ABAB";
        int k = 1;
        System.out.println(LongestCharReplacement(s,k));
    }
}
