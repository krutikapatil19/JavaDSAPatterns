import java.util.HashMap;
public class Longest {
    public static int LongestCharReplacement(String s, int k){

        HashMap<Character,Integer>map = new HashMap<>();
        int left=0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            
            int count = map.getOrDefault(ch,0)+1;
            map.put(ch, count);

            //update max Frequency , if this count is the new highest
            maxFreq = Math.max(maxFreq, count);

            int windowLength = right - left + 1;

            while(windowLength - maxFreq > k){
                char leftChar = s.charAt(left);

                //decrease leftchar's count in the map
                map.put(leftChar, map.get(leftChar)-1);
                left++;

                //recalculate windowLength
                windowLength =  right-left+1;
                //by doing right-left+1
            }
          
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;
        System.out.println(LongestCharReplacement(s,k));
    }
}
