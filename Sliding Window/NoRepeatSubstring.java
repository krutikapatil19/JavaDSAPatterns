import java.util.HashMap;
public class NoRepeatSubstring {
    public static int longestSubstringWithoutRepeatingChar(String s){

        int left = 0;   //start of window 
        int maxlength = 0;     //length of longest Substring w/o repeating characters

        //using HashMap to store frequency
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            
            //Add character to window
            map.put(ch, map.getOrDefault(ch,0) + 1);

            //Shrinking the window if a character appears more than once. (having freq >1)
            while(map.get(ch)>1){
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar)-1);

                //if frequency becomes 0 -> remove from map
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++; //move left pointer
            }
            maxlength = Math.max(maxlength, right-left+1);
        }
    return maxlength;
    }
    public static void main(String[] args){
        String s = "abcabb";
        System.out.println(longestSubstringWithoutRepeatingChar(s));
    }
}
