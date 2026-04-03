import java.util.HashMap;
public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k){

        int left = 0;       //left character of window 
        int maxLen = 0;     //store final answer 
        int maxFreq = 0;    //store highest frequency char in current window

        //to store frequency of characters 
        HashMap<Character,Integer> map = new HashMap<>();
  
        //expand window using right pointer
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);

            //add current character to map
            map.put(ch,map.getOrDefault(ch,0) + 1);

            //current window size 
            int windowSize = right-left + 1;

            //update max frequency character to map
            maxFreq = Math.max(maxFreq, map.get(ch));

            //Shrink window
            if(windowSize - maxFreq > k){
                //shrink window part
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar)-1);

                //if frequency becomes 0 -> remove from map
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }

            //update max length of valid window 
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
        }
        public static void main(String[] args){
            String s = "ABAB";
            int k = 2;
            System.out.println(characterReplacement(s,k));
        }
    }
