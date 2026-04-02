import java.util.HashMap;
public class NoRepeatSubstring {
    public static int longestSubstringWithoutRepeatingChar(String s){

        int left = 0;
        int maxlength = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            
            map.put(ch, map.getOrDefault(ch,0) + 1);

            while(map.get(ch)>1){
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar)-1);

                //shrinking the window logic 

                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
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
