import java.util.HashMap;
public class LongestRepeatingReplacement {
    public static int longestRepeatingCharReplacement(String s, int k){

        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int windowLength = 0;
        int maxFreq=0;
        int right;

        for(right = 0; right<s.length(); right++){
            windowLength = right-left+1;
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            maxFreq= Math.max(maxFreq, map.get(ch));
        }
                while((windowLength - maxFreq)>k){
            left++;
        }
        
    return maxFreq;
    }
    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;
        System.out.println(longestRepeatingCharReplacement(s,k));
    }
}
