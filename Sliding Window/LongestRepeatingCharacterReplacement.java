import java.util.HashMap;
public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k){

        //variables
        int left = 0;

        int maxLen = 0;
        int maxFreq = 0;

        HashMap<Character,Integer> map = new HashMap<>();
  
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);

            map.put(ch,map.getOrDefault(ch,0) + 1);

            int windowSize = right-left + 1;

            maxFreq = Math.max(maxFreq, map.get(ch));

            //Shrink window
            if(windowSize - maxFreq > k){
                //shrink window part
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar)-1);

                maxLen = Math.max(maxLen, right-left+1);

                //if frequency becomes 0 -> remove from map
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
        }
        return maxLen;
        }
        public static void main(String[] args){
            String s = "ABAB";
            int k = 2;
            System.out.println(characterReplacement(s,k));
        }
    }
